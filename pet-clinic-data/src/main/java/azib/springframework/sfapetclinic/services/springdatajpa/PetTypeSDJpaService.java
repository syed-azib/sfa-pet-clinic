package azib.springframework.sfapetclinic.services.springdatajpa;

import azib.springframework.sfapetclinic.model.Pet;
import azib.springframework.sfapetclinic.model.PetType;
import azib.springframework.sfapetclinic.repositories.PetRepository;
import azib.springframework.sfapetclinic.repositories.PetTypeRepository;
import azib.springframework.sfapetclinic.services.PetService;
import azib.springframework.sfapetclinic.services.PetTypeService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {
    private final PetTypeRepository petRepository;

    public PetTypeSDJpaService(PetTypeRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public PetType findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return null;
    }

    @Override
    public void delete(PetType object) {

    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
