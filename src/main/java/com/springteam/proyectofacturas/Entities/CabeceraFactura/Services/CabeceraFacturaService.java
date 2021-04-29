package com.springteam.proyectofacturas.Entities.CabeceraFactura.Services;


import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFactura;
import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

public class CabeceraFacturaService implements ICabeceraService{


    @Autowired
    CabeceraFacturaRepository cabeceraFacturaRepository;

    public CabeceraFacturaDTO getCabeceraById(Integer id) throws NotFoundException {
        //get item
        CabeceraFactura cabeceraFactura = cabeceraFacturaRepository.findById(id).orElseThrow(()-> new NotFoundException("Cabecera Factura not found"));

        CabeceraFacturaDTO dto = new CabeceraFacturaDTO();

        //set properties
        dto.setNumFactura(cabeceraFactura.getNumFactura());
        dto.setFecha(cabeceraFactura.getFecha());
        dto.setCliente(cabeceraFactura.getCliente());

        return dto;
    }
}
