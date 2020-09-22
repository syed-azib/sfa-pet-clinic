package azib.springframework.sfapetclinic.services;

import azib.springframework.sfapetclinic.model.Owner;
import azib.springframework.sfapetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
