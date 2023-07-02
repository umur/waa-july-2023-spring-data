package com.example.lab3.controller;



    import com.example.lab3.entity.Category;
    import com.example.lab3.entity.Product;
    import com.example.lab3.service.ProductService;
    import com.example.lab3.service.CategoryService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/products")
    public class ProductController {
        private final ProductService productService;

        @Autowired
        public ProductController(ProductService productService) {
            this.productService = productService;
        }

        @GetMapping
        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }

        @GetMapping("/{id}")
        public Product getProductById(@PathVariable Long id) {
            return productService.getProductById(id);
        }

        @PostMapping
        public Product createProduct(@RequestBody Product product) {
            return productService.createProduct(product);
        }

        @PutMapping("/{id}")
        public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
            return productService.updateProduct(id, updatedProduct);
        }

        @DeleteMapping("/{id}")
        public void deleteProduct(@PathVariable Long id) {
            productService.deleteProduct(id);
        }

       // @GetMapping("/byCategoryAndPrice")
        //public List<Product> getProductsByCategoryAndPriceLessThan(@RequestParam Long categoryId, @RequestParam double maxPrice) {
           // Category category = categoryService.getCategoryById(categoryId);
            //return productService.getProductsByCategoryAndPriceLessThan(category, maxPrice);
        //}

        @GetMapping("/byNameContaining")
        public List<Product> getProductsByNameContaining(@RequestParam String keyword) {
            return productService.getProductsByNameContaining(keyword);
        }




    }




