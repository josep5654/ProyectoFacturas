package com.springteam.proyectofacturas.Entities.Cliente.Services;

import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import com.springteam.proyectofacturas.Entities.Cliente.Model.ClienteDTO;
import javassist.NotFoundException;

public interface IClienteService {
    public ClienteDTO getClienteById(Integer id) throws NotFoundException;
}
