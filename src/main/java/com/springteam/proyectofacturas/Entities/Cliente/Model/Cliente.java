package com.springteam.proyectofacturas.Entities.Cliente.Model;


import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFactura;
import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue
    private int id;
    private String nombreCliente;

    @OneToMany(mappedBy = "cliente")
    private List<CabeceraFactura> cabeceras;

    public void setCabeceras(CabeceraFactura cabecera)
    {
        cabeceras.add(cabecera);
    }
}
