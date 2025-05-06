package com.connect.HotleService.services;


import com.connect.HotleService.model.Hotel;
import com.connect.HotleService.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServices
{

    @Autowired
    private HotelRepository hotelRepository;


    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }


    public void addHotel(Hotel hotel){
        hotelRepository.save(hotel);
    }


    public Optional<Hotel> getSingleHotel(Integer id){
        return hotelRepository.findById(id);
    }
}
