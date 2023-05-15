package com.pragma.powerup.usermicroservice.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {

    @Test
    void getId() {
        Long expectedId = 3L;
        Role role = new Role(expectedId, "ROLE_OWNER", "ROLE_OWNER");

        Long  currentId = role.getId();

        assertEquals(expectedId, currentId);
    }

    @Test
    void setId() {
        Long expectedId = 3L;
        Role role = new Role(6L, "ROLE_OWNER", "ROLE_OWNER");

        role.setId(expectedId);

        assertEquals(expectedId, role.getId());
    }

    @Test
    void getName() {
        String expectedName = "Admin";
        Role role =new Role(1L, expectedName, "ROLE_ADMIN");

        String currentName = role.getName();

        assertEquals(expectedName, currentName);
    }

    @Test
    void setName() {
        String expectedName = "Provider";
        Role role =new Role(1L, "Admin", "ROLE_ADMIN");

        role.setName(expectedName);

        assertEquals(expectedName, role.getName());
    }

    @Test
    void getDescription() {
        String expectedDesc = "ROLE_USER";
        Role role =new Role(1L, "User", expectedDesc);

        String obtained = role.getDescription();

        assertEquals(expectedDesc, obtained);

    }

    @Test
    void setDescription() {
        String expectedDesc = "PROVIDER";
        Role role =new Role(1L, "PROVIDER_ROLE", "ROLE_ADMIN");

        role.setDescription(expectedDesc);

        assertEquals(expectedDesc, role.getDescription());
    }
}