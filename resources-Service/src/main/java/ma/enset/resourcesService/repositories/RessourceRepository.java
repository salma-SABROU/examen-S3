package ma.enset.resourcesService.repositories;

import ma.enset.resourcesService.entities.Ressource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RessourceRepository extends JpaRepository<Ressource,Long> {
}
