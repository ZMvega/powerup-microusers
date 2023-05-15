package com.pragma.powerup.usermicroservice.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getId() {
        Long expectedId = 1L;
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitrago", "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        Long obtained = user.getId();

        assertEquals(expectedId, obtained);
    }

    @Test
    void setId() {
        Long expectedId = 4L;
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitrago", "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        user.setId(expectedId);

        assertEquals(expectedId, user.getId());
    }

    @Test
    void getName() {
        String expectedName = "Carla";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", expectedName, "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        String obtained = user.getName();

        assertEquals(expectedName, obtained);
    }

    @Test
    void setName() {
        String expectedName = "Laura";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitrago", "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        user.setName(expectedName);

        assertEquals(expectedName, user.getName());
    }

    @Test
    void getSurname() {
        String expectedSurname = "Buitrago";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", expectedSurname, "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        String obtained = user.getSurname();

        assertEquals(expectedSurname, obtained);
    }

    @Test
    void setSurname() {
        String expectedSurname = "Ortua";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitrago", "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        user.setSurname(expectedSurname);

        assertEquals(expectedSurname, user.getSurname());
    }

    @Test
    void getDniNumber() {
        String expectedDni = "123";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitagro", expectedDni,
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        String obtained = user.getDniNumber();

        assertEquals(expectedDni, obtained);
    }

    @Test
    void setDniNumber() {
        String expectedDni = "567";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitagro", "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        user.setDniNumber(expectedDni);

        assertEquals(expectedDni, user.getDniNumber());
    }

    @Test
    void getPhone() {
        String expectedPhone = "+573123331122";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitagro", "123",
                expectedPhone, "2000-02-14", "carla@gmail.com", "1234",
                role);

        String obtained = user.getPhone();

        assertEquals(expectedPhone, obtained);
    }

    @Test
    void setPhone() {
        String expectedPhone = "+573001233322";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitagro", "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        user.setPhone(expectedPhone);

        assertEquals(expectedPhone, user.getPhone());
    }

    @Test
    void getBirthDate() {
        String expectedDate = "2000-02-14";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitagro", "123",
                expectedDate, "2000-02-14", "carla@gmail.com", "1234",
                role);

        String obtained = user.getBirthDate();

        assertEquals(expectedDate, obtained);
    }

    @Test
    void setBirthDate() {
        String expectedDate = "1999-06-28";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitagro", "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        user.setBirthDate(expectedDate);

        assertEquals(expectedDate, user.getBirthDate());
    }

    @Test
    void getMail() {
        String expectedMail = "carla@gmail.com";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitagro", "123",
                "+573123331122", "2000-02-14", expectedMail, "1234",
                role);

        String obtained = user.getMail();

        assertEquals(expectedMail, obtained);
    }

    @Test
    void setMail() {
        String expectedMail = "laura@gmail.com";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitagro", "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        user.setMail(expectedMail);

        assertEquals(expectedMail, user.getMail());
    }

    @Test
    void getPassword() {
        String expectedPass = "1234";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitagro", "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", expectedPass,
                role);

        String obtained = user.getPassword();

        assertEquals(expectedPass, obtained);
    }

    @Test
    void setPassword() {
        String expectedPass = "5678";
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitagro", "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        user.setPassword(expectedPass);

        assertEquals(expectedPass, user.getPassword());
    }

    @Test
    void getRole() {
        Role expectedRole =new Role(4L, "ADMIN_ROLE", "ADMIN_ROLE");
        User user = new User(1L, "Carla", "Buitagro", "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "123",
                expectedRole);

        Role obtained = user.getRole();

        assertEquals(expectedRole, obtained);
    }

    @Test
    void setRole() {
        Role expectedRole =new Role(5L, "PROVIDER_ROLE", "PROVIDER_ROLE");
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Carla", "Buitagro", "123",
                "+573123331122", "2000-02-14", "carla@gmail.com", "1234",
                role);

        user.setRole(expectedRole);

        assertEquals(expectedRole, user.getRole());
    }
}