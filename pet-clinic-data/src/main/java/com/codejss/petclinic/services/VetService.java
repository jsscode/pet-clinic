package com.codejss.petclinic.services;

import com.codejss.petclinic.models.Vet;

import java.util.Set;

/**
 * @author codejss
 */
public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
