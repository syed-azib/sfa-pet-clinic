package azib.springframework.sfapetclinic.repositories;

import azib.springframework.sfapetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
