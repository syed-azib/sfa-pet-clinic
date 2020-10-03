package azib.springframework.sfapetclinic.repositories;

import azib.springframework.sfapetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Owner findByLastName(String lastName);
}
