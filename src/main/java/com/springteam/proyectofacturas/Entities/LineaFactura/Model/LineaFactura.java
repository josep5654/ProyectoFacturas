package com.springteam.proyectofacturas.Entities.LineaFactura.Model;

import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFactura;
import com.springteam.proyectofacturas.Entities.Producto.Model.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class LineaFactura {


    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(cascade = {CascadeType.ALL})
    private CabeceraFactura cabeceraFactura;

    @ManyToOne(cascade = CascadeType.ALL)
    @NonNull
    private Producto producto;

    @NonNull
    private Integer cantidad;

    @NonNull
    private Integer precio;
    
}
