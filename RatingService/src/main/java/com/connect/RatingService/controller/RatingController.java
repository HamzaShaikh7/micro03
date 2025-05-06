package com.connect.RatingService.controller;


import com.connect.RatingService.model.Rating;
import com.connect.RatingService.services.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rating")
public class RatingController
{


    @Autowired
    private RatingServices ratingServices;


    @GetMapping
    public List<Rating> getAllRating(){
        return ratingServices.getAllRating();
    }


    @PostMapping
    public String addHRating(@RequestBody Rating rating){
        ratingServices.addRating(rating);
        return "Rating added.";
    }


    @GetMapping("/{id}")
    public Optional<Rating> getSingleRating(@PathVariable Integer id){
        return ratingServices.getSingleRating(id);
    }



    @GetMapping("/hotelid/{id}")
    public Rating getByHotelId(@PathVariable String id){
        return ratingServices.getByHotelId(id);
    }


    
    @GetMapping("/userid/{id}")
    public List<Rating> getSingleHotel(@PathVariable String id){
        return ratingServices.getByUserId(id);
    }





}
