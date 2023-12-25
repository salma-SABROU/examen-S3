package ma.enset.reservationservice;

import ma.enset.reservationservice.entities.Personne;
import ma.enset.reservationservice.entities.Reservation;
import ma.enset.reservationservice.repositories.PersonneRepository;
import ma.enset.reservationservice.repositories.ReservationRepository;
import ma.enset.reservationservice.services.RessourceRestClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class ReservationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PersonneRepository personneRepository, ReservationRepository reservationRepository, RessourceRestClientService ressourceRestClientService){
		return args -> {
			personneRepository.save(Personne.builder().nom("salma").email("salma@gmail.com").fonction("Devops").build());
			personneRepository.save(Personne.builder().nom("amine").email("salma@RH.gmail.com").fonction("RH").build());
			personneRepository.save(Personne.builder().nom("manal").email("salma@IA.gmail.com").fonction("IA").build());

			reservationRepository.save(Reservation.builder().contexte("context").duree(20).date(new Date()).nom("reservation name").build());
			reservationRepository.save(Reservation.builder().contexte("context 2").duree(40).date(new Date()).nom("reservation name 2").build());
			reservationRepository.save(Reservation.builder().contexte("context 3").duree(10).date(new Date()).nom("reservation name 3").build());

		};
	}
}
