package com.asalehi.petclinick.services;

import com.asalehi.petclinick.models.Person;

import java.util.Set;

public interface PersonService {

    Person findByLastName(String lastName);
    Person findById(Long id);
    Person save(Person p);
    Set<Person> findAll();
}
