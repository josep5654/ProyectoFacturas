package com.springteam.proyectofacturas.Entities.CabeceraFactura.model;

import com.springteam.proyectofacturas.Entities.Cliente.Model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CabeceraFacturaDTO {

    private String numFactura;
    private Date fecha;
    private Cliente cliente;
}
