package com.jhipster.example.swaggercli.web.rest;

import com.jhipster.example.swaggercli.client.petstore.api.PetsApiClient;
import com.jhipster.example.swaggercli.client.petstore.model.PetClientDTO;
import com.jhipster.example.swaggercli.client.petstore.model.PetsClientDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PetTestResource controller
 */
@RestController
@RequestMapping("/api/pet-test")
public class PetTestResource {

    private final Logger log = LoggerFactory.getLogger(PetTestResource.class);

    private final PetsApiClient petApiClient;

    public PetTestResource(PetsApiClient petApiClient) {
        this.petApiClient = petApiClient;
    }

    /**
    * GET getPets
    */
    @GetMapping("/get-a-pet")
    public ResponseEntity<PetClientDTO> getPets() {
        ResponseEntity<PetsClientDTO> pets = petApiClient.listPets(10);
        return ResponseEntity.ok(pets.getBody().get(0));
    }

}
