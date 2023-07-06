package com.w1d3.springdata.service.impl;

import com.w1d3.springdata.dto.ProductDto;
import com.w1d3.springdata.entity.Product;
import com.w1d3.springdata.repository.ProductRepo;
import com.w1d3.springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;

    @Override
    public void save(Product product) {

        productRepo.save(product);
    }

    @Override
    public List<ProductDto> findAll() {
        var productList = (List<Product>) productRepo.findAll();
        return productList.stream().map(p -> modelMapper.map(p, ProductDto.class)).toList();
    }

    @Override
    public ProductDto findById(int id) {
        var product = productRepo.findById(id).get();
        return modelMapper.map(product, ProductDto.class);
    }

    @Override
    public void deleteById(int id) {
        productRepo.deleteById(id);

    }

    public List<ProductDto> findProductsMoreThanMinPrice(double minPrice) {
        return productRepo.findByPriceGreaterThan(minPrice)
                .stream().map(product -> modelMapper
                        .map(product, ProductDto.class)).toList();
    }

    public List<ProductDto> findByCategoryAnAndPriceLessThan(String cat, double maxPrice) {
        return productRepo.findByCategory_NameIgnoreCaseAndPriceLessThan(cat, maxPrice)
                .stream().map(product -> modelMapper.map(product,ProductDto.class)).toList();
    }

    @Override
    public List<ProductDto> findByNameContains(String keyword) {
        return productRepo.findByNameContainsIgnoreCase(keyword).stream()
                .map(product -> modelMapper.map(product,ProductDto.class)).toList();
    }
}
