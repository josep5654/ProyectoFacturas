package com.springteam.proyectofacturas.Entities.CabeceraFactura.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.springteam.proyectofacturas.Entities.Cliente.Model.Cliente;
import com.springteam.proyectofacturas.Entities.Cliente.Model.ClienteDTO;
import com.springteam.proyectofacturas.Entities.LineaFactura.Model.LineaFacturaDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CabeceraFacturaDTO {

    private String numFactura;

    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date fecha;
    private ClienteDTO cliente;

    private List<LineaFacturaDTO> lineas;


    public static CabeceraFacturaDTO convertToDto(CabeceraFactura cabeceraFactura){
        return null;
    }
}
