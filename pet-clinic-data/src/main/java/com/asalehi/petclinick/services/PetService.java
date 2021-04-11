package com.asalehi.petclinick.services;

import com.asalehi.petclinick.models.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet p);
    Set<Pet> findAll();
}
