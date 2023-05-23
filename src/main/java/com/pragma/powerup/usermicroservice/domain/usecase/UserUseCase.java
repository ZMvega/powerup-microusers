package com.pragma.powerup.usermicroservice.domain.usecase;

import com.pragma.powerup.usermicroservice.configuration.Constants;
import com.pragma.powerup.usermicroservice.domain.api.IUserServicePort;
import com.pragma.powerup.usermicroservice.domain.model.User;
import com.pragma.powerup.usermicroservice.domain.spi.IRolePersistencePort;
import com.pragma.powerup.usermicroservice.domain.spi.IUserPersistencePort;

import java.time.LocalDate;
import java.time.Period;

public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;
    private final IRolePersistencePort rolePersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort, IRolePersistencePort rolePersistencePort) {
        this.userPersistencePort = userPersistencePort;
        this.rolePersistencePort = rolePersistencePort;
    }

    @Override
    public void saveUser(User user) {
        userPersistencePort.saveUser(user);
    }

    @Override
    public void saveOwner(User user) {
        LocalDate currently = LocalDate.now();
        LocalDate birthDate;
        Period age;
        try{
             birthDate = LocalDate.parse(user.getBirthDate());
        }catch (NullPointerException n){
            throw  new RuntimeException("Birdate null");
        }

        if(birthDate != null){
            age = Period.between(birthDate, currently);
        }else{
            throw new IllegalArgumentException();
        }

        if (age.getYears() >= 18){
            user.setRole(rolePersistencePort.getRole(Constants.OWNER_ROLE_ID));
            userPersistencePort.saveOwner(user);
        }else {
            throw new IllegalArgumentException("Owner must have 18 years old");
        }
    }
}
