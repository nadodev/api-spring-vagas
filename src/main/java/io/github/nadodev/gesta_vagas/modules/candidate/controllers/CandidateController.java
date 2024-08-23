package io.github.nadodev.gesta_vagas.modules.candidate.controllers;


import io.github.nadodev.gesta_vagas.modules.candidate.CandidateEntity;
import io.github.nadodev.gesta_vagas.modules.candidate.CandidateRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;


    @PostMapping("/")
    public void create(@Valid @RequestBody CandidateEntity candidateEntity) {
        candidateRepository.save(candidateEntity);
    }
}
