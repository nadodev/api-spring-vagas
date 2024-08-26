package io.github.nadodev.gesta_vagas.modules.company.repositories;

import io.github.nadodev.gesta_vagas.modules.candidate.entities.CandidateEntity;
import io.github.nadodev.gesta_vagas.modules.company.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

    Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);
}
