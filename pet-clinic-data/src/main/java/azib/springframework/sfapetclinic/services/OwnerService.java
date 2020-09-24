package azib.springframework.sfapetclinic.services;

import azib.springframework.sfapetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

     Owner findByLastName(String lastName);

     Set<Owner> findAll();

}
