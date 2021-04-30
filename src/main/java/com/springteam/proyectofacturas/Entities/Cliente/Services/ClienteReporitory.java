package com.springteam.proyectofacturas.Entities.Cliente.Services;

import com.springteam.proyectofacturas.Entities.Cliente.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteReporitory extends JpaRepository<Cliente,Integer> {
}
