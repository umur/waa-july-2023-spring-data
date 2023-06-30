package w1d4.springdata.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import w1d4.springdata.entity.Product;
import w1d4.springdata.service.ProductService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    
    private final ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }

}
