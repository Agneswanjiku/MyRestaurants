package com.moringaschool.myrestaurants.network;

import com.moringaschool.myrestaurants.models.Bussiness;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {
    @GET("businesses/search")
    Call<Bussiness> getRestaurants(
            @Query("location") String location,
            @Query("term") String term
    );

}

