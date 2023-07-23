package Lab3.Product_Review_Application.service.impl;

import Lab3.Product_Review_Application.entity.Product;
import Lab3.Product_Review_Application.repository.ProductRepo;
import Lab3.Product_Review_Application.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Override
    public void addProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public void updateProduct(int id, Product product) {
        Product productToUpdate = getProduct(id);
        productToUpdate.setName(product.getName());
        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setRating(product.getRating());
        productToUpdate.setReviews(product.getReviews());
        productToUpdate.setCategory(product.getCategory());
        productRepo.save(productToUpdate);
    }

    @Override
    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public Product getProduct(int id) {
        Optional<Product> productOptional = productRepo.findById(id);
        return productOptional.orElseThrow();
    }
}
