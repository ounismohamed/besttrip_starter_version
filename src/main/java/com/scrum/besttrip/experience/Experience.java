package com.scrum.besttrip.experience;

import java.util.List;

public class Experience {






    //Members
    private String id;
    private String descriptionExperience;
    private List<String> photosExperience;
    private int rateExperience;

    //Setters
    public void setId(String id) {
        this.id = id;
    }
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
    public String getId() {
        return id;
    }
    //ctrucor
    public Experience(String id,String descriptionExperience, List<String> photosExperience, int rateExperience) {
        this.id=id;
        this.descriptionExperience = descriptionExperience;
        this.photosExperience = photosExperience;
        this.rateExperience = rateExperience;
    }


}
