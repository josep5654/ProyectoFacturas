package com.springteam.proyectofacturas.Entities.CabeceraFactura.Controller;

import com.springteam.proyectofacturas.Entities.CabeceraFactura.Services.ICabeceraService;
import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/factura")
public class CabeceraFacturaController {
    //  ruta-> /api/factura/

    @Autowired
    ICabeceraService cabeceraService;


    @GetMapping("/{id}")
    public CabeceraFacturaDTO getCabecera(@PathVariable String id)  {
        try {
            return cabeceraService.getCabeceraById(Integer.parseInt(id));
        }catch (NotFoundException e){
            return null;
        }

    }


}
