package com.belloche.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetStoreDaoTest {

    @Test
    void getPetSuccess() {
        PetStoreDao dao = new PetStoreDao();
        assertEquals("Tica", dao.getPet(1).getName());
        assertEquals("available", dao.getPet(1).getStatus());
    }
}
