package com.example.retrofitdemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonObject
{
    public JsonObject(String deliveryOption, double latitude, double longitude, double rating, String district, String state, Boolean isGiveaway, Boolean isNearest) {
        this.deliveryOption = deliveryOption;
        this.latitude = latitude;
        this.longitude = longitude;
        this.rating = rating;
        this.district = district;
        this.state = state;
        this.isGiveaway = isGiveaway;
        this.isNearest = isNearest;
    }

    @SerializedName("deliveryOption")
    @Expose
    private String deliveryOption;
    @SerializedName("latitude")
    @Expose
    private double latitude;
    @SerializedName("longitude")
    @Expose
    private double longitude;
    @SerializedName("rating")
    @Expose
    private double rating;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("isGiveaway")
    @Expose
    private Boolean isGiveaway;
    @SerializedName("isNearest")
    @Expose
    private Boolean isNearest;


    public String getDeliveryOption() {
        return deliveryOption;
    }

    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getGiveaway() {
        return isGiveaway;
    }

    public void setGiveaway(Boolean giveaway) {
        isGiveaway = giveaway;
    }

    public Boolean getNearest() {
        return isNearest;
    }

    public void setNearest(Boolean nearest) {
        isNearest = nearest;
    }
    public String toString() {
        return "JsonObject{" +
                "deliveryOption='" + deliveryOption + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude=" + longitude +
                ", rating=" + rating +
                ", district=" + district +
                ", state=" + state +
                ", giveaway=" + isGiveaway +
                ", isNearest=" + isNearest + '}';

    }

}
