package com.springteam.proyectofacturas.Entities.Cliente.Controller;

import com.springteam.proyectofacturas.Entities.Cliente.Model.Cliente;
import com.springteam.proyectofacturas.Entities.Cliente.Model.ClienteDTO;
import com.springteam.proyectofacturas.Entities.Cliente.Services.ClienteReporitory;
import com.springteam.proyectofacturas.Entities.Cliente.Services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController
{
    @Autowired
    IClienteService serviceClint;

    @Autowired
    ClienteReporitory clienteReporitory;

    @GetMapping("/{id}")
    private List getCliente(@PathVariable Integer id)
    {
        return  null;
    }

    @PostMapping("/add")
    private void addCliente(@RequestBody ClienteDTO nuevoClienteDto)
    {
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombreCliente(nuevoClienteDto.getNombreCliente());
        //servicio save
        clienteReporitory.saveAndFlush(nuevoCliente);
    }

    @DeleteMapping("/delete/{id}")
    private void removeCliente(@PathVariable Integer id)
    {

    }

    @PutMapping("/edit/{id}")
    private void setCliente(@PathVariable Integer id, @RequestBody ClienteDTO clienteDto)
    {

    }

    //  ruta-> /api/Cliente/
}
