package com.connect.RatingService.services;


import com.connect.RatingService.model.Rating;
import com.connect.RatingService.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingServices
{

    @Autowired
    private RatingRepository ratingRepository;


    public List<Rating> getAllHotels() {
        return ratingRepository.findAll();
    }


    public void addHotel(Rating rating){
        ratingRepository.save(rating);
    }


    public Optional<Rating> getSingleRating(Integer id){
        return ratingRepository.findById(id);
    }


    public Rating getByHotelId(String id){
        return ratingRepository.findByHotelId(id);
    }



    public Rating getByUserId(String id){
        return ratingRepository.findByUserId(id);
    }



}
