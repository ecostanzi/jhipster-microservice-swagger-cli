package com.jhipster.example.swaggercli.web.rest;

import com.jhipster.example.swaggercli.web.api.PetsApiDelegate;
import com.jhipster.example.swaggercli.web.api.model.Pet;
import com.jhipster.example.swaggercli.web.api.model.Pets;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author Enrico Costanzi
 */
@Service
public class PetApiDelegateImpl implements PetsApiDelegate {

    @Override
    public ResponseEntity<Void> createPets() {
        return null;
    }

    @Override
    public ResponseEntity<Pets> listPets(Integer limit) {
        Pets pets = new Pets();
        pets.add(new Pet().id(1L).name("dog").tag("dog tag"));
        pets.add(new Pet().id(2L).name("cat").tag("cat tag"));
        return ResponseEntity.ok(pets);
    }

    @Override
    public ResponseEntity<Pets> showPetById(String petId) {
        return null;
    }
}
