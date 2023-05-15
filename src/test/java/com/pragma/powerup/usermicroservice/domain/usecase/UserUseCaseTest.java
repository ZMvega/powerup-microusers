package com.pragma.powerup.usermicroservice.domain.usecase;

import com.pragma.powerup.usermicroservice.domain.model.Role;
import com.pragma.powerup.usermicroservice.domain.model.User;
import com.pragma.powerup.usermicroservice.domain.spi.IUserPersistencePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class UserUseCaseTest {

    @Mock
    private IUserPersistencePort userPersistencePort;
    private UserUseCase userUseCase;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
        userUseCase = new UserUseCase(userPersistencePort);
    }

    @Test
    void saveUser() {
        Role role =new Role(2L, "USER_ROLE", "USER_ROLE");
        User user = new User(1L, "Camilo", "Gonzales", "123",
                "+573123331122", "2002-02-21", "andres@gmail.com", "1234",
                role);

        userUseCase.saveUser(user);

        verify(userPersistencePort, times(1)).saveUser(user);
    }

    @Test
    void saveOwner() {
        Role role =new Role(3L, "OWNER_ROLE", "OWNER_ROLE");
        User user = new User(1L, "Juan", "Peña", "123",
                "+573123331122", "2003-08-10", "juan@gmail.com", "1234",
                role);
        User user1 = new User(1L, "Juan", "Peña", "123",
                "+57312333112214", "2008-08-10", "invalid", "1234",
                role);

        userUseCase.saveOwner(user);

        verify(userPersistencePort, times(1)).saveOwner(user);

        assertThrows(IllegalArgumentException.class, () -> userUseCase.saveOwner(user1));
        verify(userPersistencePort, times(1)).saveOwner(user1);
    }
}