package com.pragma.powerup.usermicroservice.domain.usecase;

import com.pragma.powerup.usermicroservice.domain.api.IUserServicePort;
import com.pragma.powerup.usermicroservice.domain.model.User;
import com.pragma.powerup.usermicroservice.domain.spi.IUserPersistencePort;

public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort personPersistencePort) {
        this.userPersistencePort = personPersistencePort;
    }

    @Override
    public void saveUser(User user) {
        userPersistencePort.saveUser(user);
    }

    @Override
    public void saveOwner(User user) {
        String phoneRegex = "^\\+?[0-9]{12}$";
        String dniRegex = "^[0-9]+$";
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if(!user.getPhone().matches(phoneRegex)){
            throw new IllegalArgumentException("Phone must have 13 digits including '+'");
        }
        if(!user.getDniNumber().matches(dniRegex)){
            throw new IllegalArgumentException("DNI must be only number");
        }
        if(!user.getMail().matches(emailRegex)){
            throw new IllegalArgumentException("Mail must have the right srructure");
        }

        /*NullPointerException
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate currently = LocalDate.now();
        LocalDate birthDate;
        Period age;
        try{
             birthDate = LocalDate.parse(user.getBirthDate(), formatter);
        }catch (NullPointerException n){
            throw  new RuntimeException("Birdate null");
        }
        if(birthDate != null){
            age = Period.between(birthDate, currently);
        }else{
            throw new IllegalArgumentException();
        }
        if (age.getYears() < 18){
            throw new IllegalArgumentException("Owner must have 18 years");
        }
        */

        if((user.getPhone().matches(phoneRegex)) &&
                (user.getDniNumber().matches(dniRegex)) &&
                (user.getMail().matches(emailRegex))
        ){
            userPersistencePort.saveOwner(user);
        }
    }
}
