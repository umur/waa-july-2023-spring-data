package w1d4.springdata.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import w1d4.springdata.entity.Product;
import w1d4.springdata.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product update(Long id, Product product) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()){
            optionalProduct.get().setName(product.getName());
            optionalProduct.get().setPrice(product.getPrice());
            optionalProduct.get().setRating(product.getRating());
            optionalProduct.get().setCategory(product.getCategory());
            optionalProduct.get().setReviews(product.getReviews());
        }
        return optionalProduct.orElse(null);
    }

    @Override
    public void delete(Long id) {
        productRepository.delete(findById(id));
    }
}
