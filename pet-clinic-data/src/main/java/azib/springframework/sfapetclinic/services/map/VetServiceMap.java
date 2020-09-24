package azib.springframework.sfapetclinic.services.map;

import azib.springframework.sfapetclinic.model.Owner;
import azib.springframework.sfapetclinic.model.Vet;
import azib.springframework.sfapetclinic.services.CrudService;
import azib.springframework.sfapetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }


}
