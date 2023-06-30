package com.waa.assignment_three.controller;

import com.waa.assignment_three.entity.Category;
import com.waa.assignment_three.entity.Product;
import com.waa.assignment_three.entity.Review;
import com.waa.assignment_three.entity.User;
import com.waa.assignment_three.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/filterByMinPrice")
    public List<Product> findAllByPriceGreaterThan(@RequestParam Double minPrice){
        return productService.findAllByPriceGreaterThan(minPrice);
    }

    @GetMapping("/filterByCategoryAndMaxPrice")
    public List<Product> findAllByCategoryAndPriceLessThan(@RequestParam Category category, @RequestParam Double maxPrice){
        return productService.findAllByCategoryAndPriceLessThan(category, maxPrice);
    }

    @GetMapping("/filterByKeyword")
    public List<Product> findAllByNameContains(@RequestParam String keyword){
        return productService.findAllByNameContains(keyword);
    }

    @GetMapping("/{id}/reviews")
    public List<Review> findAllProductReviews(@PathVariable Long id){
        return productService.findAllProductReviews(id);
    }

    @PostMapping
    public void save(@RequestBody Product product){
        productService.save(product);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Product product){
        productService.updateById(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }
}
