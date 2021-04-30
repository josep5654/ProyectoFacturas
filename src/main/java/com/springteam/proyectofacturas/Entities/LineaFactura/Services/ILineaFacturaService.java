package com.springteam.proyectofacturas.Entities.LineaFactura.Services;



import com.springteam.proyectofacturas.Entities.CabeceraFactura.model.CabeceraFacturaDTO;
import com.springteam.proyectofacturas.Entities.LineaFactura.Model.LineaFacturaDTO;
import javassist.NotFoundException;

import java.util.List;

public interface ILineaFacturaService {

    public LineaFacturaDTO getLineaFacturaById(Integer id) throws NotFoundException;
    public LineaFacturaDTO getLineaFacturaByHeader(CabeceraFacturaDTO cabeceraFacturaDTO) throws NotFoundException;
    public List<LineaFacturaDTO> getAllLineaFacturas();
    public void updateLineaFactura(Integer id,LineaFacturaDTO lineaFacturaDTO) throws NotFoundException;
    public void deleteLineaFactura(Integer id);
    public void createLineaFactura(LineaFacturaDTO lineaFacturaDTO);


}
