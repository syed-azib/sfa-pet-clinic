package azib.springframework.sfapetclinic.repositories;

import azib.springframework.sfapetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
