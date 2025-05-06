package com.connect.RatingService.repositories;

import com.connect.RatingService.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,Integer> {


    Rating findByUserId(String userId);
    Rating findByHotelId(String hotelId);

}
