package com.scrum.besttrip.ville;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class VilleService {
    private List<Ville> villes = new ArrayList<>( Arrays.asList(
            new Ville("V1","N_V1","pays_v1","V1_Guide",Arrays.asList()),
            new Ville("V2","N_V2","pays_v2","V2_Guide",Arrays.asList()),
            new Ville("V3","N_V3","pays_v3","V3_Guide",Arrays.asList())
    ));

    public List<Ville> getAllVilles () {

        return villes;

    }
    public Ville getVille(String id){

        return villes.stream().filter(t -> t.getId().equals(id)).findFirst().get();

    }

    public void addVille(Ville ville){
        villes.add(ville); /* .add() is specific to the List data structure/collection*/
    }

    public void updateVille(String id, Ville ville) {
        int n =villes.size();
        for (int i=0;i<n;i++){
            Ville v=villes.get(i);
            if (v.getId().equals(id)){
                villes.set(i,ville);
            return;
            }
        }
    }

    public void deleteVille(String id) {
        villes.removeIf(t-> t.getId().equals(id));
    }
}
