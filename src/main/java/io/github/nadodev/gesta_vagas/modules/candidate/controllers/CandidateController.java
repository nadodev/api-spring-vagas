package io.github.nadodev.gesta_vagas.modules.candidate.controllers;


import io.github.nadodev.gesta_vagas.exceptions.UserFoundExceptions;
import io.github.nadodev.gesta_vagas.modules.candidate.CandidateEntity;
import io.github.nadodev.gesta_vagas.modules.candidate.CandidateRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    private final CandidateRepository candidateRepository;

    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @PostMapping("/")
    public void create(@Valid @RequestBody CandidateEntity candidateEntity) {
        this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail()).ifPresent(candidate -> {
            throw new UserFoundExceptions("Username or email already exists");
        });

        candidateRepository.save(candidateEntity);
    }
}
