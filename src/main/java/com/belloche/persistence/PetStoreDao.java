package com.belloche.persistence;

import com.exercise.Pet;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class PetStoreDao {
    Pet getPet(int id) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://petstore.swagger.io/v2/pet/" + id + "/");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Pet pet = null;
        try {
            pet = mapper.readValue(response, Pet.class);
        } catch (JsonProcessingException jpe) {
            jpe.printStackTrace();
        }
        return pet;
    }
}
