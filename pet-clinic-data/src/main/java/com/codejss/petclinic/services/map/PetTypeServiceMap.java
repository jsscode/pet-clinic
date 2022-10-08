package com.codejss.petclinic.services.map;

import com.codejss.petclinic.models.PetType;
import com.codejss.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author codejss
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
