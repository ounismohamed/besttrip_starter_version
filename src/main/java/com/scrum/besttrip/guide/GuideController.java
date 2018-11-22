package com.scrum.besttrip.guide;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class GuideController {

    @Autowired
    private GuideService GuideService1 = new GuideService();

    @RequestMapping("/guides")

    public List<Guide> getAllGuides(){

        return GuideService1.getAllguides();
    }

    @RequestMapping("/guides/{ch}") /* ch is the url variable*/
    public Guide getGuide(@PathVariable("ch") String id){ /*to match the "ch" to the variable "id"*/

        return GuideService1.getGuide(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/guides") /* get is the default method so in this we need to specify POST */
    public void addGuide(@RequestBody Guide guide){ /* the @RequestBody will convert the return of the POST to a Topic object*/

        GuideService1.addGuide(guide);

    }
}
