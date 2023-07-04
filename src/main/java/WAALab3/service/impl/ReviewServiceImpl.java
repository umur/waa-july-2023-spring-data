package WAALab3.service.impl;

import WAALab3.entity.Review;
import WAALab3.repository.ReviewRepo;
import WAALab3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepo reviewRepo;

    @Override
    public List<Review> findAllByProduct(Long productId){
        return reviewRepo.findAllByProduct_Id(productId);
    }

    @Override
    public List<Review> findAll(){
        return reviewRepo.findAll();
    }

    @Override
    public Review findById(Long id){
        var res = reviewRepo.findById(id);

        if(res.isPresent())
            return res.get();

        throw new NoSuchElementException("Review Not Found");

    }

    @Override
    public void create(Review review){
        if(review.getComment().isBlank())
            throw new IllegalArgumentException("Comment Cannot be Empty");

        reviewRepo.save(review);
    }


    @Override
    public void update(Review review){
        var prev = findById(review.getId());

        create(review);
    }

    @Override
    public void delete(Long id){
        reviewRepo.deleteById(id);
    }
}
