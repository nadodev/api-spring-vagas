package io.github.nadodev.gesta_vagas.modules.company.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Pattern(regexp = "\\S+", message = "O campo [Username] não pode conter espaços em branco")
    private String username;

    @Email(message = "Email inválido")
    private String email;

    @NotBlank
    @Size(min = 4, message = "O campo [Password] deve ter no mínimo 4 caracteres", max = 100)
    private String password;
    private String website;

    @NotBlank
    private String name;
    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
