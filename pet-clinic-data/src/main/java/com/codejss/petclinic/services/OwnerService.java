package com.codejss.petclinic.services;

import com.codejss.petclinic.models.Owner;

import java.util.Set;

/**
 * @author codejss
 *
 */
public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
