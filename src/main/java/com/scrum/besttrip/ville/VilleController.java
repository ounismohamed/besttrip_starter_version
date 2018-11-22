package com.scrum.besttrip.ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class VilleController {

    @Autowired
    private VilleService VilleService1 = new VilleService();


    @RequestMapping("/villes")

    public List<Ville> getAllVilles(){

        return VilleService1.getAllVilles();
    }

    @RequestMapping("/villes/{ch}") /* ch is the url variable*/
    public Ville getVille(@PathVariable("ch") String id){ /*to match the "ch" to the variable "id"*/

        return VilleService1.getVille(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/villes") /* get is the default method so in this we need to specify POST */
    public void addTopic(@RequestBody Ville ville){ /* the @RequestBody will convert the return of the POST to a Topic object*/

        VilleService1.addVille(ville);

    }

}
