package io.github.nadodev.gesta_vagas.modules.company.useCases;

import io.github.nadodev.gesta_vagas.exceptions.UserFoundExceptions;
import io.github.nadodev.gesta_vagas.modules.company.entities.CompanyEntity;
import io.github.nadodev.gesta_vagas.modules.company.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntity) {

        this.companyRepository.findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
                .ifPresent(company -> {
                    throw new UserFoundExceptions("Usuário já cadastrado com esse email ou username");
                });

      return  this.companyRepository.save(companyEntity);
    }
}
