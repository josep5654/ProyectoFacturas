package com.springteam.proyectofacturas.Entities.Producto.Controller;

import com.springteam.proyectofacturas.Entities.Producto.Model.Producto;
import com.springteam.proyectofacturas.Entities.Producto.Model.ProductoDTO;
import com.springteam.proyectofacturas.Entities.Producto.Services.ProductoRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    ProductoRepository productoRepository;


    @GetMapping
    public List<ProductoDTO> getAllProductos(){
    List<Producto> productosList= productoRepository.findAll();
    List<ProductoDTO> productoDTOSList= productosList.stream().map(
            productos -> new ProductoDTO(productos.getNombreProducto()))
            .collect(Collectors.toList());

    return productoDTOSList;
    }

    @GetMapping("{id}")
    public Optional<Producto> getProdutobyID(@PathVariable Integer id)throws NotFoundException {

       // List<Producto> productoid= productoRepository.findAllById(id) ;

       // ProductoDTO productoDTO= new ProductoDTO(productoRepository.findById(id));

        return productoRepository.findById(id) ;
    }
}
