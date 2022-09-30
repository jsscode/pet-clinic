package com.codejss.petclinic.services;

import com.codejss.petclinic.models.Owner;

import java.util.Set;

/**
 * @author codejss
 *
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
