package com.pragma.powerup.usermicroservice.domain.usecase;

import com.pragma.powerup.usermicroservice.domain.model.Role;
import com.pragma.powerup.usermicroservice.domain.spi.IRolePersistencePort;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RoleUseCaseTest {


    @Test
    void getAllRoles() {
        IRolePersistencePort rolePersistencePort = mock(IRolePersistencePort.class);

        Role role1 = new Role(1L, "ADMIN_ROLE", "ADMIN_ROLE");
        Role role2 = new Role(2L, "USER_ROLE", "USER_ROLE");
        Role role3 = new Role(3L, "PROVIDER_ROLE", "PROVIDER_ROLE");
        Role role4 = new Role(4L, "OWNER_ROLE", "OWNER_ROLE");
        List<Role> expectedRoles = Arrays.asList(role1, role2, role3, role4);

        when(rolePersistencePort.getAllRoles()).thenReturn(expectedRoles);
        RoleUseCase roleUseCase = new RoleUseCase(rolePersistencePort);
        List<Role> actualRoles = roleUseCase.getAllRoles();

        assertEquals(expectedRoles, actualRoles);
    }
}