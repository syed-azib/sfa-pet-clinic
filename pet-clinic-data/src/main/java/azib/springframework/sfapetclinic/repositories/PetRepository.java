package azib.springframework.sfapetclinic.repositories;

import azib.springframework.sfapetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
