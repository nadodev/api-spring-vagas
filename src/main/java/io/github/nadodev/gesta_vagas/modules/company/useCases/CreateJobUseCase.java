package io.github.nadodev.gesta_vagas.modules.company.useCases;

import io.github.nadodev.gesta_vagas.exceptions.UserFoundExceptions;
import io.github.nadodev.gesta_vagas.modules.company.entities.CompanyEntity;
import io.github.nadodev.gesta_vagas.modules.company.entities.JobEntity;
import io.github.nadodev.gesta_vagas.modules.company.repositories.CompanyRepository;
import io.github.nadodev.gesta_vagas.modules.company.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreateJobUseCase {
    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity) {
       return jobRepository.save(jobEntity);
    }
}
