package com.bulsi.petclinic.services;

import com.bulsi.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
