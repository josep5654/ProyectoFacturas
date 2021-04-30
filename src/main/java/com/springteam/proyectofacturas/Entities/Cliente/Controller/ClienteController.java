package com.springteam.proyectofacturas.Entities.Cliente.Controller;

import com.springteam.proyectofacturas.Entities.Cliente.Model.Cliente;
import com.springteam.proyectofacturas.Entities.Cliente.Model.ClienteDTO;
import com.springteam.proyectofacturas.Entities.Cliente.Services.ClienteReporitory;
import com.springteam.proyectofacturas.Entities.Cliente.Services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController
{
    @Autowired
    IClienteService serviceClint;

    @GetMapping("/{id}")
    private List getCliente(@PathVariable Integer id)
    {
        return serviceClint.getCliente(id);
    }

    @GetMapping("/ver")
    private List getClientes()
    {
        return serviceClint.getAllClientes();
    }

    @PostMapping("/add")
    private void addCliente(@RequestBody ClienteDTO nuevoClienteDto)
    {
        serviceClint.createCliente(nuevoClienteDto);
    }

    @DeleteMapping("/delete/{id}")
    private void removeCliente(@PathVariable Integer id)
    {
        serviceClint.deleteCliente(id);
    }

    @PutMapping("/edit/{id}")
    private void setCliente(@PathVariable Integer id, @RequestBody ClienteDTO clienteDto)
    {
        try
        {
            serviceClint.updateCliente(id, clienteDto);
        }
        catch (Exception e)
        {
            System.err.println("ERROR: \n\t" + e.getMessage());
        }
    }

    //  ruta-> /api/Cliente/
}
