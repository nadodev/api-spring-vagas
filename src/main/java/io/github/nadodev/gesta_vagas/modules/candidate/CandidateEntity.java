package io.github.nadodev.gesta_vagas.modules.candidate;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private String username;

    @Email(message = "Email should be valid")
    private String email;

    @NotNull
    private String password;
    private String description;
    private String curriculum;



}
