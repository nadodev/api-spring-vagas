package io.github.nadodev.gesta_vagas.modules.candidate.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "candidate")
public class CandidateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotBlank
    @Pattern(regexp = "\\S+", message = "O campo [Username] não pode conter espaços em branco")
    private String username;

    @Email(message = "Email deve ser valido")
    private String email;

    @NotBlank
    @Size(min = 4, message = "O campo [Password] deve ter no mínimo 4 caracteres", max = 100)
    private String password;
    private String description;
    private String curriculum;


    @CreationTimestamp
    private LocalDateTime createdAt;



}
