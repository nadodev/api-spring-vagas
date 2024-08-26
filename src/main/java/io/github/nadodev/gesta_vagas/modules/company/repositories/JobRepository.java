package io.github.nadodev.gesta_vagas.modules.company.repositories;

import io.github.nadodev.gesta_vagas.modules.company.entities.CompanyEntity;
import io.github.nadodev.gesta_vagas.modules.company.entities.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, Long> {
}
