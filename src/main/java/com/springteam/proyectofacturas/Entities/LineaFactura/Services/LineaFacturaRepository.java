package com.springteam.proyectofacturas.Entities.LineaFactura.Services;

import com.springteam.proyectofacturas.Entities.LineaFactura.Model.LineaFactura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineaFacturaRepository  extends JpaRepository<LineaFactura,Integer> {
}
