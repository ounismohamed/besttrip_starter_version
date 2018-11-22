package com.scrum.besttrip.guide;

import com.scrum.besttrip.guide.Guide;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GuideService {
    private List<Guide> guides = new ArrayList<>( Arrays.asList(
            new Guide("Gui1","Desc1",Arrays.asList(),1),
            new Guide("Gui2","Desc2",Arrays.asList(),2),
            new Guide("Gui3","Desc3",Arrays.asList(),3)
    ));
    public List<Guide> getAllguides () {

        return guides;

    }
    public Guide getGuide(String id){

        return guides.stream().filter(t -> t.getId().equals(id)).findFirst().get();

    }
    public void addGuide(Guide guide){
        guides.add(guide); /* .add() is specific to the List data structure/collection*/
    }
}
