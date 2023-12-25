package ma.enset.reservationservice.web;

import ma.enset.reservationservice.entities.Reservation;
import ma.enset.reservationservice.model.Ressource;
import ma.enset.reservationservice.repositories.PersonneRepository;
import ma.enset.reservationservice.repositories.ReservationRepository;
import ma.enset.reservationservice.services.RessourceRestClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class appController {

    private PersonneRepository personneRepository;
    private ReservationRepository reservationRepository;
    private RessourceRestClientService ressourceRestClientService;

    public appController(PersonneRepository personneRepository, ReservationRepository reservationRepository, RessourceRestClientService ressourceRestClientService) {
        this.personneRepository = personneRepository;
        this.reservationRepository = reservationRepository;
        this.ressourceRestClientService = ressourceRestClientService;

    }


    @GetMapping("/reservations")
    @ResponseBody
    public List<Reservation> customers(){
        List<Reservation> reservationList= reservationRepository.findAll();

        return reservationList;
    }


    @GetMapping("/ressources")
    @ResponseBody
    public List<Ressource> allRessources(){
        List<Ressource> ressourceList= ressourceRestClientService.allRessources();

        return ressourceList;
    }
}
