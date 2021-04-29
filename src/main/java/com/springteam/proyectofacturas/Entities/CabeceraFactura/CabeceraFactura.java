package com.springteam.proyectofacturas.Entities.CabeceraFactura;

import com.springteam.proyectofacturas.Entities.Cliente.Cliente;
import com.springteam.proyectofacturas.Entities.LineaFactura.LineaFactura;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CabeceraFactura {

    @Id
    @GeneratedValue
    private Integer id;

    @NonNull
    private String numFactura;


    private Date fecha;

    @NonNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente cliente;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<LineaFactura> lineaFacturas;
}
