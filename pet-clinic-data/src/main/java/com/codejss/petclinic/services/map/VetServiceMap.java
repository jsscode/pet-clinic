package com.codejss.petclinic.services.map;

import com.codejss.petclinic.models.Vet;
import com.codejss.petclinic.services.SpecialtyService;
import com.codejss.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author codejss
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

    private SpecialtyService specialtyService;

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        if (object != null) {

            if (object.getSpecialities().size() > 0) {
                object.getSpecialities().forEach(speciality -> {
                    if (speciality.getId() == null) {
                        var savedSpecialty = specialtyService.save(speciality);
                        speciality.setId(savedSpecialty.getId());
                    }
                });

            }
        }

        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
