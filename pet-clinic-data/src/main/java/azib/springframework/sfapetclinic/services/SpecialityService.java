package azib.springframework.sfapetclinic.services;

import azib.springframework.sfapetclinic.model.Speciality;

import java.util.Set;

public interface SpecialityService extends CrudService<Speciality,Long> {
    Set<Speciality> findAll();
}
