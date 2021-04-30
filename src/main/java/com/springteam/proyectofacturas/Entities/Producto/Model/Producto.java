package com.springteam.proyectofacturas.Entities.Producto.Model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String nombreProducto;

    public Producto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
}
