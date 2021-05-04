package com.springteam.proyectofacturas.Entities.CabeceraFactura.Services;

import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import javassist.NotFoundException;

import java.util.List;


public interface ICabeceraService {


    public CabeceraFacturaDTO getCabeceraById(Integer id) throws NotFoundException;
    public List<CabeceraFacturaDTO> getAllCabeceras();
    public void updateCabecera(Integer id,CabeceraFacturaDTO cabeceraFacturaDTO) throws NotFoundException;
    public void deleteCabecera(Integer id) throws NotFoundException;
    public void createCabecera(CabeceraFacturaDTO cabeceraFacturaDTO);

}
