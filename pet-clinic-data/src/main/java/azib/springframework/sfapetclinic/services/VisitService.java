package azib.springframework.sfapetclinic.services;

import azib.springframework.sfapetclinic.model.Pet;
import azib.springframework.sfapetclinic.model.Visit;

import java.util.Set;

public interface VisitService extends CrudService<Visit, Long>{
    Set<Visit> findAll();
}
