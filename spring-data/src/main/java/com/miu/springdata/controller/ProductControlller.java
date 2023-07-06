package com.miu.springdata.controller;

import com.miu.springdata.model.Product;
import com.miu.springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductControlller {

    @Autowired
    private ProductService service;

    @PostMapping()
    private ResponseEntity<Product> save(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(product));
    }

    @GetMapping("/byPrice/{minPrice}")
    public List<Product> findProductsMoreThanMinPrice(@PathVariable double minPrice){
        return service.findAllProductCostMoreThanGivenPrice(minPrice);
    }

    @GetMapping("/categoryname/{cat}/maxprice/{maxPrice}")
    public List<Product> findProductsByCategoryAndPrice(@PathVariable String cat,@PathVariable double maxPrice){
        return service.findAllProductInCategoryWhichCostLessThanMaxPrice(cat,maxPrice);
    }

    @GetMapping("/name/contains/{keyword}")
    public List<Product> findByNameContains(@PathVariable String keyword){
        return service.findAllProductContainsKeywordInName(keyword);
    }
}
