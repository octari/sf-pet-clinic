package guru.springframework.sfpetclinic.service.map;


import java.util.Set;

import guru.springframework.sfpetclinic.model.Pet;
import guru.springframework.sfpetclinic.service.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

  @Override
  public Set<Pet> findAll() {
    return null;
  }

  @Override
  public void deleteById(Long id) {

  }

  @Override
  public void delete(Pet object) {

  }

  @Override
  public Pet save(Pet object) {
    return null;
  }

  @Override
  public Pet findById(Long id) {
    return null;
  }

}
