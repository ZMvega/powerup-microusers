package com.pragma.powerup.usermicroservice.domain.spi;

import com.pragma.powerup.usermicroservice.domain.model.Role;

import java.util.List;

public interface IRolePersistencePort {
    Role getRole(Long id);
    List<Role> getAllRoles();
}
