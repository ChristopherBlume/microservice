package bmwgroup.adf.productservice.controller;

import bmwgroup.adf.productservice.domain.Product;
import bmwgroup.adf.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public List getProducts() {
        return productRepository.findAll();
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }
}

