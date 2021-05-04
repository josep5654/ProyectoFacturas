package com.springteam.proyectofacturas.Entities.Cliente.Services;

import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFactura;
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
        List dto = new ArrayList();
        dto.addAll(clienteReporitory.findAll());
        return dto;
    }

    private double importe = 0;

    @Override
    public List getCliente(Integer id)
    {
        importe = 0;
        //Controlador GET /cliente/{id} -> Listado detodaslas facturas de un cliente (List<Numero factura,fecha facturae importe factura>)
        List devolver = new ArrayList();
        try
        {
            Optional<Cliente> clienete = clienteReporitory.findById(id);
            if(!clienete.isEmpty())
            {
                devolver.add(clienete.get().getNombreCliente());

                //String idFactura = clienete.get().getCabeceras().get(0).getNumFactura();
                clienete.get()
                        .getCabeceras()
                        .forEach(
                                cabecera ->
                                {
                                    devolver.add(cabecera.getNumFactura());
                                    devolver.add(cabecera.getFecha());
                                    cabecera.getLineaFacturas().forEach(linea -> devolver.add(linea.getProducto().getNombreProducto()));
                                    cabecera.getLineaFacturas().forEach(linea -> {importe += linea.getCantidad()*linea.getPrecio();});
                                    devolver.add(importe);
                                });
                //buscar lineas de factura
            }
            else
            {
                System.err.println("Cliente inexistente");
            }
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        return  devolver;
    }

    @Override
    public void updateCliente(Integer id, ClienteDTO clienteDTO) throws NotFoundException
    {
        Optional<Cliente> cliente = clienteReporitory.findById(id);//.orElseThrow(System.err.println("ERROR"));
        if(cliente.isEmpty())
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
        if(!clienteDTO.getCabeceraFacturas().isEmpty())
        {
            nuevoCliente.setAllCabeceras(clienteDTO.getCabeceraFacturas());
        }
        clienteReporitory.saveAndFlush(nuevoCliente);
    }
}
