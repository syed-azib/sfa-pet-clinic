package azib.springframework.sfapetclinic.services;

import azib.springframework.sfapetclinic.model.Pet;
import azib.springframework.sfapetclinic.model.PetType;

import java.util.Set;

public interface PetTypeService extends CrudService<PetType, Long>{
    Set<PetType> findAll();
}
