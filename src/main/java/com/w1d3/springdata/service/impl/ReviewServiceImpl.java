package com.w1d3.springdata.service.impl;

import com.w1d3.springdata.dto.ReviewDto;
import com.w1d3.springdata.entity.Review;
import com.w1d3.springdata.repository.ReviewRepo;
import com.w1d3.springdata.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepo reviewRepo;
    private final ModelMapper modelMapper;
    @Override
    public void save(Review review) {
    reviewRepo.save(review);
    }

    @Override
    public List<ReviewDto> findAll() {

        var reviewList= (List<Review>)reviewRepo.findAll() ;
        return reviewList.stream().map(review -> modelMapper.map(review, ReviewDto.class)).toList();
    }

    @Override
    public ReviewDto findById(int id) {
        return modelMapper.map(reviewRepo.findById(id).get(), ReviewDto.class);
    }
    @Override
    public void deleteById(int id) {
    reviewRepo.deleteById(id);
    }

    @Override
    public List<ReviewDto> reviewsByProductId(int id) {

        return reviewRepo.findReviewByProduct_Id(id).stream().map(review ->
                modelMapper.map(review,ReviewDto.class)).toList();
    }

//    private ReviewDto getDto(Review review){
//        return modelMapper.map(review, ReviewDto.class);
//    }
//    private List<ReviewDto> getDto(List<Review> review){
//        return review.stream().map(p->{
//            return getDto(p);
//        }).collect(Collectors.toList());
//    }
}
