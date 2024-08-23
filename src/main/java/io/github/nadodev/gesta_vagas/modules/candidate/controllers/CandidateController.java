package io.github.nadodev.gesta_vagas.modules.candidate.controllers;


import io.github.nadodev.gesta_vagas.modules.candidate.entities.CandidateEntity;
import io.github.nadodev.gesta_vagas.modules.candidate.useCases.CreateCandidateUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CreateCandidateUseCase createUseCase;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody CandidateEntity candidateEntity) {
       try {
           var result = this.createUseCase.execute(candidateEntity);
           return ResponseEntity.ok().body(result);
       } catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
       }
    }
}
