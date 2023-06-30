package com.waa.assignment_three.config;

import com.waa.assignment_three.entity.Category;
import com.waa.assignment_three.entity.Product;
import com.waa.assignment_three.entity.Review;
import com.waa.assignment_three.entity.User;
import com.waa.assignment_three.repository.CategoryRepo;
import com.waa.assignment_three.repository.ProductRepo;
import com.waa.assignment_three.repository.ReviewRepo;
import com.waa.assignment_three.repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {

    @Bean
    CommandLineRunner commandLineRunner(UserRepo userRepo, ProductRepo productRepo, CategoryRepo categoryRepo, ReviewRepo reviewRepo){
        return args -> {
            User user1 = new User(
                         1L,
                    "Bitsu@gmail.com",
                    "helloworld".toCharArray(),
                    "Bitsu",
                    "Mamo",
                    null,
                    null
            );

            Review review1 = new Review(
                    1L,
                    "Bad",
                    user1
            );
            Review review2 = new Review(
                    2L,
                    "Good",
                    user1
            );
            Review review3 = new Review(
                    3L,
                    "Excellent",
                    user1
            );

            Review review4 = new Review(
                    4L,
                    "Hurgh",
                    user1
            );

            Category category1 = new Category(
                    1L,
                    "Furit",
                    null
            );


            Product product1 = new Product(
                    1L,
                    "Apple",
                    8D,
                    5,
                    category1,
                    List.of(review1, review2)
            );
            Product product2 = new Product(
                    2L,
                    "Banana",
                    4D,
                    3,
                    category1,
                    List.of(review3, review4)
            );
            Product product3 = new Product(
                    3L,
                    "Pineapple",
                    9D,
                    1,
                    category1,
                    null
            );

            category1.setProducts(List.of(product1, product2, product3));

//            userRepo.saveAll(
//                    List.of(
//                            user1
//                    )
//            );
//
//            productRepo.saveAll(
//                    List.of(
//                            product1,
//                            product2,
//                            product3
//                    )
//            );
//
//            categoryRepo.saveAll(
//                    List.of(
//                            category1
//                    )
//            );
//
//
//
//            reviewRepo.saveAll(
//                    List.of(
//                            review1,
//                            review2,
//                            review3,
//                            review4
//                    )
//            );


        };
    }
}
