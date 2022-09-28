package com.codejss.petclinic.services;

import com.codejss.petclinic.models.Pet;

import java.util.Set;

/**
 * @author codejss
 */
public interface PetService {

    Pet findById(Long id);
    Pet save(Pet per);
    Set<Pet> findAll();
}
