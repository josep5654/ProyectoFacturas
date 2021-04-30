package com.springteam.proyectofacturas.Entities.Cliente.Services;

import com.springteam.proyectofacturas.Entities.Cliente.Model.Cliente;
import com.springteam.proyectofacturas.Entities.Cliente.Model.ClienteDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ClienteService implements IClienteService
{
    @Autowired
    ClienteReporitory clienteReporitory;

    @Override
    public ClienteDTO getClienteById(Integer id) throws NotFoundException {
        return null; //TODO
    }

    @Override
    public Cliente getClientByDTO(ClienteDTO clienteDTO) throws NotFoundException {
        return null;
    }

    @Override
    public List<ClienteDTO> getAllClientes() {
        return null;
    }

    @Override
    public List<ClienteDTO> getClientes()
    {
        return null;
    }

    @Override
    public List getCliente(Integer id)
    {
        //Controlador GET /cliente/{id} -> Listado detodaslas facturas de un cliente (List<Numero factura,fecha facturae importe factura>)
        List devolver = new ArrayList();
        try
        {
            this.getClienteById(id);
        }
        catch (Exception e){}
        return  null;
    }

    @Override
    public void updateCliente(Integer id, ClienteDTO clienteDTO) throws NotFoundException
    {
        Optional<Cliente> cliente = clienteReporitory.findById(id);//.orElseThrow(System.err.println("ERROR"));
        if(!cliente.isEmpty())
        {
            Cliente nuevoCliente = cliente.get();
            nuevoCliente.setNombreCliente(clienteDTO.getNombreCliente());
            clienteReporitory.saveAndFlush(nuevoCliente);
        }
    }

    @Override
    public void deleteCliente(Integer id)
    {
        try
        {
            clienteReporitory.deleteById(id);
        }
        catch (Exception e)
        {
            System.err.println("ERROR:\n\t" + e.getMessage());
        }
    }

    @Override
    public void createCliente(ClienteDTO clienteDTO)
    {
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombreCliente(clienteDTO.getNombreCliente());
        clienteReporitory.saveAndFlush(nuevoCliente);
    }
}
