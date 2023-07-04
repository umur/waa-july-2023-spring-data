package WAALab3.controller;

import WAALab3.entity.Review;
import WAALab3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;


    @GetMapping("filter")
    public List<Review> findByProductId(@RequestParam Long productId)
    {
        return reviewService.findAllByProduct(productId);
    }

    @GetMapping
    public List<Review> findAll(){
        return reviewService.findAll();
    }

    @GetMapping("{id}")
    public Review findById(@PathVariable Long id){
        return reviewService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Review review){
        reviewService.create(review);
    }

    @PutMapping("{id}")
    public void update(@RequestBody Review review){
        reviewService.update(review);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        reviewService.delete(id);
    }
}
