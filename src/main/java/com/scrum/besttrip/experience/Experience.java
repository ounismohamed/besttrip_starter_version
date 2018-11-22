package com.scrum.besttrip.experience;

import java.util.List;

public class Experience {


    //Members
    private String descriptionExperience;
    private List<String> photosExperience;
    private int rateExperience;

    //Setters
    public void setDescriptionExperience(String descriptionExperience) {
        this.descriptionExperience = descriptionExperience;
    }

    public void setPhotosExperience(List<String> photosExperience) {
        this.photosExperience = photosExperience;
    }

    public void setRateExperience(int rateExperience) {
        this.rateExperience = rateExperience;
    }

    //Getters
    public String getDescriptionExperience() {
        return descriptionExperience;
    }

    public List<String> getPhotosExperience() {
        return photosExperience;
    }

    public int getRateExperience() {
        return rateExperience;
    }

    public Experience(String descriptionExperience, List<String> photosExperience, int rateExperience) {
        this.descriptionExperience = descriptionExperience;
        this.photosExperience = photosExperience;
        this.rateExperience = rateExperience;
    }


}
