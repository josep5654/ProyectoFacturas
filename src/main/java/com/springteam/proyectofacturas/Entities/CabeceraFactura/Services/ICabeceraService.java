package com.springteam.proyectofacturas.Entities.CabeceraFactura.Services;

import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public interface ICabeceraService {


    public CabeceraFacturaDTO getCabeceraById(Integer id) throws NotFoundException;
}
