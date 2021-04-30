package com.springteam.proyectofacturas.Entities.Producto.Controller;

import com.springteam.proyectofacturas.Entities.Producto.Model.Producto;
import com.springteam.proyectofacturas.Entities.Producto.Model.ProductoDTO;
import com.springteam.proyectofacturas.Entities.Producto.Services.ProductoRepository;
import com.springteam.proyectofacturas.Entities.Producto.Services.ProductoService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;


    @GetMapping("/")
    public List<ProductoDTO> getAllProductos(){
    return productoService.getAllLineaProductos();
    }

    @GetMapping("/{id}")
    public ProductoDTO getProdutobyID(@PathVariable Integer id)throws NotFoundException {

        return productoService.getProductoByID(id);
    }
    @PostMapping
    public void postProducto(@RequestBody ProductoDTO productoDTO){
        productoService.createLineaProducto(productoDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable int id){
        productoService.deleteLineaProducto(id);
    }
    @PutMapping("/{id}")
    public void updateProducto(@PathVariable int id,@RequestBody ProductoDTO productoDTO) throws NotFoundException {
        productoService.updateLineaProducto(id,productoDTO);
    }
}
