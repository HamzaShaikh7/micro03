package com.connect.RatingService.controller;


import com.connect.RatingService.model.Rating;
import com.connect.RatingService.services.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotel")
public class HotelController
{


    @Autowired
    private RatingServices ratingServices;


    @GetMapping
    public List<Rating> getAllHotels(){
        return ratingServices.getAllHotels();
    }


    @PostMapping
    public String addHotel(@RequestBody Rating rating){
        ratingServices.addHotel(rating);
        return "Rating added.";
    }


    @GetMapping("/{id}")
    public Optional<Rating> getSingleHotel(@PathVariable Integer id){
        return ratingServices.getSingleRating(id);
    }



    @GetMapping("/hotelid/{id}")
    public Rating getByHotelId(@PathVariable String id){
        return ratingServices.getByHotelId(id);
    }


    
    @GetMapping("/userid/{id}")
    public Rating getSingleHotel(@PathVariable String id){
        return ratingServices.getByUserId(id);
    }





}
