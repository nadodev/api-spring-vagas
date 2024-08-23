package io.github.nadodev.gesta_vagas.modules.candidate;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "candidate")
public class CandidateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

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


    @CreatedDate
    private LocalDateTime createdAt;



}
