package scoty.springframework.sfgpetclinic.service;

import scoty.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwenerService extends CrudService<Owner,Long> {

    Owner findbyLastName(String lastName);

}
