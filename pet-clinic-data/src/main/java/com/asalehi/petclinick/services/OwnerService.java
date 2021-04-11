package com.asalehi.petclinick.services;

import com.asalehi.petclinick.models.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long Id);
    Owner save(Owner o);
    Set<Owner> findAll();
}
