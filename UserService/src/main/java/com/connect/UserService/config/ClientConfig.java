package com.connect.UserService.config;

import com.connect.UserService.model.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "RATING-SERVICE")
public interface ClientConfig {


    @GetMapping("/rating/userid/{userId}")
    List<Rating> getRatingByUser(@PathVariable Integer userId);
}
