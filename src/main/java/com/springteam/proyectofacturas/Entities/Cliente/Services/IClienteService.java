package com.springteam.proyectofacturas.Entities.Cliente.Services;

import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import com.springteam.proyectofacturas.Entities.Cliente.Model.ClienteDTO;
import javassist.NotFoundException;

import java.util.List;

public interface IClienteService {


    public ClienteDTO getClienteById(Integer id) throws NotFoundException;
    public List<ClienteDTO> getAllClientes();
    public void updateCliente(Integer id,ClienteDTO clienteDTO) throws NotFoundException;
    public void deleteCliente(Integer id);
    public void createCliente(ClienteDTO clienteDTO);


}
