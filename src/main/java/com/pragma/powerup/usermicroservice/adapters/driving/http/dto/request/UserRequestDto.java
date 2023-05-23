package com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class UserRequestDto {
    @NotNull
    private String name;

    @NotNull
    private String surname;

    @NotEmpty(message = "DNI must be only number")
    @Pattern(regexp = "^[0-9]+$")
    private String dniNumber;

    @NotEmpty(message = "Phone must have 13 digits including '+'")
    @Pattern(regexp = "^\\+?[0-9]{12}$")
    private String phone;

    @NotEmpty(message = "Birth Date can´t be null")
    @NotNull
    private LocalDate birthDate;

    @NotEmpty(message = "Mail must have the right structure")
    @Email
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")
    private String mail;

    @NotNull
    private String password;

}
