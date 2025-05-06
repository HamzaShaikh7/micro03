package com.connect.RatingService.repositories;

import com.connect.RatingService.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,Integer> {


    List<Rating> findByUserId(String userId);
    Rating findByHotelId(String hotelId);

}
