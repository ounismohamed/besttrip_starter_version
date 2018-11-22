package com.scrum.besttrip.experience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ExperienceController {

    @Autowired
    private ExperienceService ExperienceService1 = new ExperienceService();

    @RequestMapping("/experiences")
    public List<Experience> getAllExperiences(){

        return ExperienceService1.getAllexperiences();
    }

    @RequestMapping("/experiences/{ch}") /* ch is the url variable*/
    public Experience getExperience(@PathVariable("ch") String id){ /*to match the "ch" to the variable "id"*/

        return ExperienceService1.getExperience(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/experiences") /* get is the default method so in this we need to specify POST */
    public void addService(@RequestBody Experience experience){ /* the @RequestBody will convert the return of the POST to a Topic object*/

        ExperienceService1.addExperience(experience);

    }
}
