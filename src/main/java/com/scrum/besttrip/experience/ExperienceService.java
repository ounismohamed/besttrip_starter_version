package com.scrum.besttrip.experience;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ExperienceService {
    private List<Experience> experiences = new ArrayList<>( Arrays.asList(
            new Experience("Exp1","Desc1",Arrays.asList(),1),
            new Experience("Exp2","Desc2",Arrays.asList(),2),
            new Experience("Exp3","Desc3",Arrays.asList(),3)
    ));
    public List<Experience> getAllexperiences () {

        return experiences;

    }
    public Experience getExperience(String id){

        return experiences.stream().filter(t -> t.getId().equals(id)).findFirst().get();

    }
    public void addExperience(Experience experience){
        experiences.add(experience); /* .add() is specific to the List data structure/collection*/
    }
}
