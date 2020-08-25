package scoty.springframework.sfgpetclinic.service;

import scoty.springframework.sfgpetclinic.model.Owner;
import scoty.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
