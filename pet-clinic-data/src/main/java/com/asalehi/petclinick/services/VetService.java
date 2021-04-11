package com.asalehi.petclinick.services;

import com.asalehi.petclinick.models.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet v);
    Set<Vet> findAll();
}
