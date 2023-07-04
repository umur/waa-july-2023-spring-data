package WAALab3.service.impl;

import WAALab3.entity.Product;
import WAALab3.repository.ProductRepo;
import WAALab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;

    @Override
    public List<Product> findAllByPriceGreaterThan(int minPrice){
        return productRepo.findAllByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findAllByCategoryAndPriceLessThan(Long categoryId, int maxPrice){
        return productRepo.findAllByCategory_IdAndPriceLessThan(categoryId,maxPrice);
    }

    @Override
    public List<Product> findAllByNameContaining(String keyword){
        return productRepo.findAllByNameContaining(keyword);
    }

    @Override
    public List<Product> findAll(){
        return  productRepo.findAll();
    }

    @Override
    public  Product findById(Long id) {
        var product = productRepo.findById(id);

        if(product.isPresent())
            return product.get();

        throw new NoSuchElementException("Product Not Found");

    }

    @Override
    public void create(Product product){
        if(product.getName().isBlank())
            throw new IllegalArgumentException("Name Cannot be Empty");

        productRepo.save(product);
    }

    @Override
    public void update(Product product){
        var prev = findById(product.getId());
        create(product);
    }

    @Override
    public void delete(Long id){
        productRepo.deleteById(id);
    }

}
