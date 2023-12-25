package ma.enset.resourcesService.web;


import ma.enset.resourcesService.entities.Ressource;
import ma.enset.resourcesService.repositories.RessourceRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RessourceRestController {

    private RessourceRepository ressourceRepository;

    public RessourceRestController(RessourceRepository ressourceRepository) {
        this.ressourceRepository = ressourceRepository;
    }

    @GetMapping("/ressources")
    @ResponseBody
    public List<Ressource> ressources(){
        List<Ressource> ressourceList= ressourceRepository.findAll();

        return ressourceList;
    }

    @GetMapping("/ressources/{id}")
    @ResponseBody
    public Ressource getCustomerById(@PathVariable Long id){
        List<Ressource> ressourceList= ressourceRepository.findAll();
        Ressource ressource=new Ressource();
        for (int i = 0; i < ressourceList.size(); i++) {
            Ressource element = ressourceList.get(i);
            if(element.getId() == id){
                ressource=element;
            }
        }

        return ressource;
    }

}
