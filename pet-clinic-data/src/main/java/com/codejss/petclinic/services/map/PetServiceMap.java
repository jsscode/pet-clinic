package com.codejss.petclinic.services.map;

import com.codejss.petclinic.models.Pet;
import com.codejss.petclinic.services.CrudService;
import com.codejss.petclinic.services.PetService;

import java.util.Set;

/**
 * @author codejss
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
