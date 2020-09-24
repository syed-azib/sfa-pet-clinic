package azib.springframework.sfapetclinic.services;

import azib.springframework.sfapetclinic.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long>{
    Set<Pet> findAll();


}
