package com.codejss.petclinic.services.map;

import com.codejss.petclinic.models.Speciality;
import com.codejss.petclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author codejss
 */
@Service
public class SpecialtyServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
