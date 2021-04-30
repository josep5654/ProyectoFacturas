package com.springteam.proyectofacturas.Entities.Cliente.Model;

import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFactura;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ClienteDTO
{
    private int id;
    private String nombreCliente;
}
