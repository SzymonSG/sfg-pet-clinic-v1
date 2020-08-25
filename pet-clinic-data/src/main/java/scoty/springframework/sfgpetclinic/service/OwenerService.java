package scoty.springframework.sfgpetclinic.service;

import scoty.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwenerService {

    Owner findbyLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
