package azib.springframework.sfapetclinic.repositories;

import azib.springframework.sfapetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
