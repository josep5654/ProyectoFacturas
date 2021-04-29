package com.springteam.proyectofacturas.Entities.Cliente.Services;

import com.springteam.proyectofacturas.Entities.Cliente.Model.ClienteDTO;
import javassist.NotFoundException;
import org.springframework.stereotype.Component;

@Component
public class ClienteService implements IClienteService {
    @Override
    public ClienteDTO getClienteById(Integer id) throws NotFoundException {
        return null; //TODO
    }
}
