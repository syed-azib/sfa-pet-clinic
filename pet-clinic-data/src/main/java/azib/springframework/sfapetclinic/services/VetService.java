package azib.springframework.sfapetclinic.services;

import azib.springframework.sfapetclinic.model.Owner;
import azib.springframework.sfapetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet,Long> {

    Set<Vet> findAll();

}
