package com.springteam.proyectofacturas.Entities.LineaFactura.Services;


import com.springteam.proyectofacturas.Entities.LineaFactura.Model.LineaFacturaDTO;
import javassist.NotFoundException;

public interface ILineaFacturaService {

    public LineaFacturaDTO getLineaFacturaById(Integer id) throws NotFoundException;
}
