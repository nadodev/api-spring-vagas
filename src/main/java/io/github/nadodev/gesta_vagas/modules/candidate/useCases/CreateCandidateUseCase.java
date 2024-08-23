package io.github.nadodev.gesta_vagas.modules.candidate.useCases;

import io.github.nadodev.gesta_vagas.exceptions.UserFoundExceptions;
import io.github.nadodev.gesta_vagas.modules.candidate.entities.CandidateEntity;
import io.github.nadodev.gesta_vagas.modules.candidate.CandidateRepository;
import org.springframework.stereotype.Service;


@Service
public class CreateCandidateUseCase {
    private final CandidateRepository candidateRepository;

    public CreateCandidateUseCase(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }


    public CandidateEntity execute(CandidateEntity candidateEntity){
        this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail()).ifPresent(candidate -> {
            throw new UserFoundExceptions("Usuário já cadastrado com esse email ou username");
        });

        return candidateRepository.save(candidateEntity );
    }
}
