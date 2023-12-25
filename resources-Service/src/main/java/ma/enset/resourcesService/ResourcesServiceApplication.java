package ma.enset.resourcesService;

import ma.enset.resourcesService.entities.Ressource;
import ma.enset.resourcesService.enums.Type;
import ma.enset.resourcesService.repositories.RessourceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ResourcesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourcesServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(RessourceRepository ressourceRepository){
		return args -> {
			ressourceRepository.save(Ressource.builder().nom("Ressource 01").type(Type.MATERIEL_INF0).build());
			ressourceRepository.save(Ressource.builder().nom("Ressource 02").type(Type.MATERIEL_INF0).build());
			ressourceRepository.save(Ressource.builder().nom("Ressource 03").type(Type.MATERIEL_AUDIO_VUSUEL).build());
		};
	}

}
