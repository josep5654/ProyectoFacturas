package com.springteam.proyectofacturas.Entities.Cliente.Services;

import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import javassist.NotFoundException;

public interface IClienteService {
    public CabeceraFacturaDTO getClienteById(Integer id) throws NotFoundException;
}
