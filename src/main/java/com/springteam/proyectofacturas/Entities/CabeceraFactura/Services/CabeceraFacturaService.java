package com.springteam.proyectofacturas.Entities.CabeceraFactura.Services;


import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFactura;
import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import com.springteam.proyectofacturas.Entities.Cliente.Services.ClienteReporitory;
import com.springteam.proyectofacturas.Entities.Cliente.Services.ClienteService;
import com.springteam.proyectofacturas.Entities.Cliente.Services.IClienteService;
import com.springteam.proyectofacturas.Entities.LineaFactura.Services.ILineaFacturaService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CabeceraFacturaService implements ICabeceraService{


    @Autowired
    CabeceraFacturaRepository cabeceraFacturaRepository;
    @Autowired
    IClienteService clienteService;
    @Autowired
    ILineaFacturaService lineaFacturaService;

    @Override
    public CabeceraFacturaDTO getCabeceraById(Integer id) throws NotFoundException {
        //get item
        CabeceraFactura cabeceraFactura = cabeceraFacturaRepository.findById(id).orElseThrow(()-> new NotFoundException("Cabecera Factura not found"));

        CabeceraFacturaDTO dto = new CabeceraFacturaDTO();

        //set properties
        dto.setNumFactura(cabeceraFactura.getNumFactura());
        dto.setFecha(cabeceraFactura.getFecha());

        //TODO falta el metodo para obtener todas las lineas

        dto.setCliente(clienteService.getClienteById(cabeceraFactura.getCliente().getId()));

        return dto;
    }

}
