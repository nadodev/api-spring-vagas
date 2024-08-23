package io.github.nadodev.gesta_vagas.modules.candidate;

import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;

    @NotNull
    private String name;

    @NotBlank
    @Pattern(regexp = "\\S+", message = "O campo [Username] não pode conter espaços em branco")
    private String username;

    @Email(message = "Email deve ser valido")
    private String email;

    @NotBlank
    @Size(min = 4, message = "O campo [Password] deve ter no mínimo 4 caracteres")
    private String password;
    private String description;
    private String curriculum;



}
