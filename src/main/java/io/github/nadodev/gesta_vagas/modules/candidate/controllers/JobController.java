package io.github.nadodev.gesta_vagas.modules.candidate.controllers;


import io.github.nadodev.gesta_vagas.modules.company.entities.JobEntity;
import io.github.nadodev.gesta_vagas.modules.company.useCases.CreateJobUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobController {


    @Autowired
    CreateJobUseCase createJobUseCase;

    @PostMapping("/create")
    public JobEntity create(@Valid @RequestBody JobEntity jobEntity) {
        return this.createJobUseCase.execute(jobEntity);
    }
}
