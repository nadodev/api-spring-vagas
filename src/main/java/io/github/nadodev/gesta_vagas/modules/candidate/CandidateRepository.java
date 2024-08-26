package io.github.nadodev.gesta_vagas.modules.candidate;

import io.github.nadodev.gesta_vagas.modules.candidate.entities.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CandidateRepository  extends JpaRepository<CandidateEntity, Long> {

    Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);
}
