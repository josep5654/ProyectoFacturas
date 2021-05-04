package com.springteam.proyectofacturas.Entities.Cliente.Model;


import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFactura;
import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreCliente;

    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "cliente")
    private List<CabeceraFactura> cabeceras = new ArrayList<>();

    public void addListacabeceras(List<CabeceraFactura> cabeceras)
    {
        cabeceras.addAll(cabeceras);
    }

}
