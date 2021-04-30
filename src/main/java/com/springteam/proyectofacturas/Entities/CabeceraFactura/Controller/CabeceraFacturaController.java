package com.springteam.proyectofacturas.Entities.CabeceraFactura.Controller;

import com.springteam.proyectofacturas.Entities.CabeceraFactura.Services.ICabeceraService;
import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/")
    public List<CabeceraFacturaDTO> getAllCabecera(@PathVariable String id)  {
        return cabeceraService.getAllCabeceras();
    }

    @PostMapping("/")
    public String addCabecera(@RequestBody CabeceraFacturaDTO cabeceraFacturaDTO)  {
         cabeceraService.createCabecera(cabeceraFacturaDTO);

        return "ok";
    }
    @DeleteMapping("/{id}")
    public String removeCabecera(@PathVariable String id)  {

        cabeceraService.deleteCabecera(Integer.parseInt(id));

        return "ok";
    }

    @PutMapping("/{id}")
    public String editCabecera(@PathVariable String id, @RequestBody CabeceraFacturaDTO cabeceraFacturaDTO)  {

        try {
            cabeceraService.updateCabecera(Integer.parseInt(id),cabeceraFacturaDTO);
        }catch (NotFoundException e){

        }


        return "ok";
    }


}
