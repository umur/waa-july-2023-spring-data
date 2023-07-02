package lab3.service.impl;

import lab3.entity.Address;
import lab3.entity.Category;
import lab3.entity.Product;
import lab3.repostory.CategoryRepo;
import lab3.repostory.ProductRepo;
import lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private CategoryRepo categoryRepo;


    public List<Product> getAll(){
        return this.productRepo.findAll();
    }
    public Optional<Product> findById(Long id){
       return  this.productRepo.findById(id);
    }
    public Product create(Product product)
    {
        return this.productRepo.save(product);
    }
    public Optional<Product>  update(Long id, Product updatedProduct){
        Optional<Product>  existingProduct = findById(id);
        if(existingProduct.isEmpty()){
            return existingProduct;
        }
        existingProduct.get().setName(updatedProduct.getName());
        existingProduct.get().setPrice(updatedProduct.getPrice());
        existingProduct.get().setRating(updatedProduct.getRating());
        existingProduct.get().setDescription(updatedProduct.getDescription());
        existingProduct.get().setCategory(updatedProduct.getCategory());

        return Optional.of(productRepo.save(existingProduct.get()));
    }

    public void deleteById(Long id){
        this.productRepo.deleteById(id);
    }

    @Override
    public List<Product> getByMinPrice(Double price) {
        return productRepo.findAllByPriceGreaterThan(price);
    }

    @Override
    public List<Product> getByCategoryAndMaxPrice(Long catId, Double price) {
        Optional<Category> category = categoryRepo.findById(catId);
        if (category.isEmpty())
            return Collections.emptyList();
        return productRepo.findAllByCategoryAndPriceLessThan(category.get(), price);
    }

    @Override
    public List<Product> getByKeyword(String keyword) {
        return productRepo.findAllByNameContaining(keyword);
    }
}
