package com.springteam.proyectofacturas.Entities.LineaFactura.Model;

import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFactura;
import com.springteam.proyectofacturas.Entities.Producto.Model.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class LineaFacturaDTO {


    private Integer id;
    private CabeceraFactura cabeceraFactura;
    private Producto producto;
    private Integer cantidad;
    private Integer precio;
}
