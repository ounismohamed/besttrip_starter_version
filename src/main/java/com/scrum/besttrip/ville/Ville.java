package com.scrum.besttrip.ville;

import com.scrum.besttrip.experience.Experience;

import java.util.List;

public class Ville {
   //Members

    private String nomVille;
    private String paysVille;
    private String guide;
    private List<Experience> experiences;

    public Ville(String p_nomVille, String p_paysVille, String p_guide, List<Experience> p_experiences) {
        nomVille = p_nomVille;
        paysVille = p_paysVille;
        guide = p_guide;
        this.experiences = p_experiences;
    }
    //Getters
    public String getnomVille() {
        return nomVille;
    }

    public String getpaysVille() {
        return paysVille;
    }

    public String getguide() {
        return guide;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    //Setters

    public void setnomVille(String nomVille) {
        nomVille = nomVille;
    }

    public void setpaysVille(String paysVille) {
        paysVille = paysVille;
    }

    public void setguide(String guide) {
        guide = guide;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }




}
