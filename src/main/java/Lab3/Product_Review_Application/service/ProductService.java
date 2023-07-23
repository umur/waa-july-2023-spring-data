package Lab3.Product_Review_Application.service;

import Lab3.Product_Review_Application.entity.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    List<Product> getAllProducts();
    void updateProduct(int id, Product product);
    void deleteProduct(int id);

    Product getProduct(int id);
}
