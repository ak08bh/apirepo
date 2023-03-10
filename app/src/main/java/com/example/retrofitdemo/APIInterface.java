package com.example.retrofitdemo;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {
    @POST("dashboard/getGeneralProducts")
    Call<JsonObject> getDashboardGeneralProduct(
            @Query("lattitude") double latitude,
            @Query("longitude") double longitude,
            @Query("rating") double rating,
            @Query("district") String district,
            @Query("state") String state,
            @Query("isGiveaway") Boolean isGiveaway,
            @Query("isNearest") Boolean isNearest);


}