package com.scrum.besttrip.guide;

import java.util.List;

public class Guide {

    //Members
    private String id;
    private String descriptionGuide;
    private List<String> photosGuide;
    private int rateGuide;

 //Setters
 public void setId(String id) {
     this.id = id;
 }
    public void setDescriptionGuide(String descriptionGuide) {
        this.descriptionGuide = descriptionGuide;
    }

    public void setPhotosGuide(List<String> photosGuide) {
        this.photosGuide = photosGuide;
    }

    public void setRateGuide(int rateGuide) {
        this.rateGuide = rateGuide;
    }

    //Getters
    public String getId() {
        return id;
    }
    public String getDescriptionGuide() {
        return descriptionGuide;
    }

    public List<String> getPhotosGuide() {
        return photosGuide;
    }

    public int getRateGuide() {
        return rateGuide;
    }

    public Guide(String id,String descriptionGuide, List<String> photosGuide, int rateGuide) {
        this.id=id;
        this.descriptionGuide = descriptionGuide;
        this.photosGuide = photosGuide;
        this.rateGuide = rateGuide;
    }

}
