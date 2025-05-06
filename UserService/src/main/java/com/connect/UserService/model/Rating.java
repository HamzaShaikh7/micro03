package com.connect.UserService.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating
{
    private String id;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;

}
