package com.springteam.proyectofacturas.Entities.Cliente.Model;


import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFactura;
import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    private List<CabeceraFactura> cabeceras;

    public void setAllCabeceras(List<CabeceraFactura> cabeceras)
    {
        cabeceras.addAll(cabeceras);
    }

    public void setCabeceras(CabeceraFactura cabecera)
    {
        cabeceras.add(cabecera);
    }
}
