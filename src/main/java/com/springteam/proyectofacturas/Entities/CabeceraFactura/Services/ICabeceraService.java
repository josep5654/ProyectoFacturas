package com.springteam.proyectofacturas.Entities.CabeceraFactura.Services;

import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import javassist.NotFoundException;

public interface ICabeceraService {
    public CabeceraFacturaDTO getCabeceraById(Integer id) throws NotFoundException;
}
