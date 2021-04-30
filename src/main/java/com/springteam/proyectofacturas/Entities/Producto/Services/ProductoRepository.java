package com.springteam.proyectofacturas.Entities.Producto.Services;

import com.springteam.proyectofacturas.Entities.Producto.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
