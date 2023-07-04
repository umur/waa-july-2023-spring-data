package WAALab3.controller;

import WAALab3.entity.Product;
import WAALab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("filterByPriceGreaterThan")
    public List<Product> findAllByPriceGreaterThan(@RequestParam int minPrice){
        return productService.findAllByPriceGreaterThan(minPrice);
    }

    @GetMapping("filterByCategoryAndPriceLessThan")
    public List<Product> findAllByCategoryAndPriceLessThan(@RequestParam Long categoryId, @RequestParam int maxPrice){
        return productService.findAllByCategoryAndPriceLessThan(categoryId,maxPrice);
    }

    @GetMapping("filterByName")
    public List<Product> findAllByNameContaining(@RequestParam String keyword){
        return productService.findAllByNameContaining(keyword);
    }

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("{id}")
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Product product){
        productService.create(product);
    }

    @PutMapping("{id}")
    public void update(@RequestBody Product product){
        productService.update(product);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        productService.delete(id);
    }
}
