package com.springteam.proyectofacturas.Entities.CabeceraFactura.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.springteam.proyectofacturas.Entities.Cliente.Model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;

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


    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date fecha;

    @NonNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente cliente;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<LineaFactura> lineaFacturas;
}
