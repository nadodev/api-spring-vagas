package io.github.nadodev.gesta_vagas.modules.company.entities;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "job")
@Data
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;
    private String benefits;
    private String levels;

    @ManyToOne
    @JoinColumn()
    private CompanyEntity companyEntity;

    private UUID companyId;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
