package com.springteam.proyectofacturas.Entities.Producto.Services;


import com.springteam.proyectofacturas.Entities.Producto.Model.ProductoDTO;
import javassist.NotFoundException;

import java.util.List;

public interface IProductoService {

    public ProductoDTO getProductoById(Integer id) throws NotFoundException;

    public List<ProductoDTO> getAllLineaProductos();
    public void updateLineaProducto(Integer id,ProductoDTO productoDTO) throws NotFoundException;
    public void deleteLineaProducto(Integer id);
    public void createLineaProducto(ProductoDTO productoDTO);
}
