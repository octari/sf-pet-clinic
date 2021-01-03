package guru.springframework.sfgpetclinic.service;


import guru.springframework.sfgpetclinic.model.Owner;

import java.util.List;


public interface OwnerService {

  Owner findByLastName(String lastName);

  List<Owner> findAllByLastNameLike(String lastName);
}

