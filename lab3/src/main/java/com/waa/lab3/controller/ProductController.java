package com.waa.lab3.controller;

import com.waa.lab3.model.Category;
import com.waa.lab3.model.Product;
import com.waa.lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> findByID(@PathVariable int id){
        return productService.findByID(id);
    }

    @GetMapping("/by-min-price")
    public List<Product> getProductsByPriceGreaterThan(@RequestParam double minPrice){
        return productService.findByPriceGreaterThan(minPrice);
    }

    @GetMapping("/by-category-and-max-price")
    public List<Product> getProductsByCategoryAndMaxPrice(@RequestParam Category category, @RequestParam double maxPrice){
        return productService.findByCategoryAndAndPriceLessThan(category, maxPrice);
    }

    @GetMapping("/by-keyword")
        public List<Product>getProductsByKeyword(@RequestParam String keyword){
            return productService.findByNameContaining(keyword);
        }


    @PostMapping
    public void createProduct(@RequestBody Product product){
        productService.save(product);
    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody Product product){
        product.setId(id);
        productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id){
        productService.delete(id);
    }
}
