package ma.enset.reservationservice.services;

import ma.enset.reservationservice.model.Ressource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "ressource-service")
public interface RessourceRestClientService {
    @GetMapping("/ressources/{id}")
    public Ressource ressourceById(@PathVariable Long id);

    @GetMapping("/ressources")
    public List<Ressource> allRessources();
}
