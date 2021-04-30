package com.springteam.proyectofacturas.Entities.Producto.Services;

import com.springteam.proyectofacturas.Entities.Producto.Model.Producto;
import com.springteam.proyectofacturas.Entities.Producto.Model.ProductoDTO;
import javassist.NotFoundException;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ProductoService implements IProductoService{

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public ProductoDTO getProductoById(Integer id) throws NotFoundException {
        return null;
    }

    @Override
    public List<ProductoDTO> getAllLineaProductos() {
        List<Producto> productosList= productoRepository.findAll();
        List<ProductoDTO> productoDTOSList= productosList.stream().map(
                productos -> new ProductoDTO(productos.getNombreProducto()))
                .collect(Collectors.toList());

        return productoDTOSList;
    }

    @Override
    public ProductoDTO getProductoByID(int id) throws NotFoundException{

        Producto producto = productoRepository.findById(id).orElseThrow(()->new NotFoundException("No se ha encontrado nada"));

        ProductoDTO productoDto = new ProductoDTO(producto.getNombreProducto());

        return productoDto;
    }

    @Override
    public void updateLineaProducto(Integer id, ProductoDTO productoDTO) throws NotFoundException {

        Producto producto = productoRepository.findById(id).map(producto1 -> {
            producto1.setNombreProducto(productoDTO.getNombreProducto());

            return productoRepository.save(producto1);
        }).
                orElseThrow(()-> new NotFoundException("No se ha encontrado el producto"));
    }

    @Override
    public void deleteLineaProducto(Integer id) {

        try {
            productoRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error al borrar: "+e.getMessage());
        }

    }

    @Override
    public void createLineaProducto(ProductoDTO productoDTO) {

        Producto nuevoProducto = new Producto(productoDTO.getNombreProducto());
    }
}
