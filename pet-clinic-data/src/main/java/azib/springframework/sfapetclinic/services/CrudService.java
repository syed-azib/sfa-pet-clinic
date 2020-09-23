package azib.springframework.sfapetclinic.services;

public interface CrudService<T, ID>  {

    Set< T > findAll;

    T findById(ID id);

    T save (T object);

    void delete(T object) ;

    void deleteById(ID id);
}
