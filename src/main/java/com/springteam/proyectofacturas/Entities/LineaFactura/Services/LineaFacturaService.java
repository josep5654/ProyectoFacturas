package com.springteam.proyectofacturas.Entities.LineaFactura.Services;

import com.springteam.proyectofacturas.Entities.LineaFactura.Model.LineaFactura;
import com.springteam.proyectofacturas.Entities.LineaFactura.Model.LineaFacturaDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class LineaFacturaService implements ILineaFacturaService{

    @Autowired
    LineaFacturaRepository lineaFacturaRepository;

    @Override
    public LineaFacturaDTO getLineaFacturaById(Integer id) throws NotFoundException {
        LineaFactura lineaFactura = lineaFacturaRepository.findById(id)
                .orElseThrow(()-> new NotFoundException("Linea Factura not found"));
        return null;
    }

    @Override
    public List<LineaFacturaDTO> getLineaFacturaByHeader(Integer cabeceraFacturaId) throws NotFoundException {
        return null;
        //TODO implement
    }

    @Override
    public List<LineaFacturaDTO> getAllLineaFacturas() {
        return null;
        //TODO implement
    }

    @Override
    public void updateLineaFactura(Integer id, LineaFacturaDTO lineaFacturaDTO) throws NotFoundException {
        //TODO implement
    }

    @Override
    public void deleteLineaFactura(Integer id) {
        //TODO implement
    }

    @Override
    public void createLineaFactura(LineaFacturaDTO lineaFacturaDTO) {
        //TODO implement
    }
}
