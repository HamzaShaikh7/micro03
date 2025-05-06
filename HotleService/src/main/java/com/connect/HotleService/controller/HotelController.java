package com.connect.HotleService.controller;


import com.connect.HotleService.model.Hotel;
import com.connect.HotleService.services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotel")
public class HotelController
{


    @Autowired
    private HotelServices hotelServices;


    @GetMapping
    public List<Hotel> getAllHotels(){
        return hotelServices.getAllHotels();
    }


    @PostMapping
    public String addHotel(@RequestBody Hotel hotel){
        hotelServices.addHotel(hotel);
        return "Hotel added.";
    }


    @GetMapping("/{id}")
    public Optional<Hotel> getSingleHotel(@PathVariable Integer id){
        return hotelServices.getSingleHotel(id);
    }
}
