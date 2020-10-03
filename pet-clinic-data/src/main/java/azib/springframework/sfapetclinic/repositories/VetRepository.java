package azib.springframework.sfapetclinic.repositories;

import azib.springframework.sfapetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
