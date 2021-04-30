package com.springteam.proyectofacturas.Entities.CabeceraFactura.Services;


import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFactura;
import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;

import com.springteam.proyectofacturas.Entities.Cliente.Model.Cliente;
import com.springteam.proyectofacturas.Entities.Cliente.Model.ClienteDTO;
import com.springteam.proyectofacturas.Entities.Cliente.Services.IClienteService;
import com.springteam.proyectofacturas.Entities.LineaFactura.Model.LineaFacturaDTO;
import com.springteam.proyectofacturas.Entities.LineaFactura.Services.ILineaFacturaService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
        CabeceraFactura cabeceraFactura = cabeceraFacturaRepository.findById(id)
                .orElseThrow(()-> new NotFoundException("Cabecera Factura not found"));

        CabeceraFacturaDTO dto = new CabeceraFacturaDTO();

        //set properties
        dto.setNumFactura(cabeceraFactura.getNumFactura());
        dto.setFecha(cabeceraFactura.getFecha());

        List<LineaFacturaDTO> lineaFacturaDTOS = lineaFacturaService.getLineaFacturaByHeader(cabeceraFactura.getId());
        dto.setLineas(lineaFacturaDTOS);
        dto.setCliente(clienteService.getClienteById(cabeceraFactura.getCliente().getId()));

        return dto;
    }

    @Override
    public List<CabeceraFacturaDTO> getAllCabeceras() {
        return null;
    }

    @Override
    public void updateCabecera(Integer id, CabeceraFacturaDTO cabeceraFacturaDTO) throws NotFoundException {
        CabeceraFactura cabeceraFactura = cabeceraFacturaRepository.findById(id)
                .orElseThrow(()-> new NotFoundException("Cabecera Factura not found"));

        cabeceraFactura.setFecha(cabeceraFacturaDTO.getFecha());

        cabeceraFactura.setNumFactura(cabeceraFacturaDTO.getNumFactura());

        Cliente cliente = clienteService.getClientByDTO(cabeceraFacturaDTO.getCliente());
        cabeceraFactura.setCliente(cliente);
    }

    @Override
    public void deleteCabecera(Integer id) {

    }

    @Override
    public void createCabecera( CabeceraFacturaDTO cabeceraFacturaDTO) {

    }

}
