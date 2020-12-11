package ru.shatrov.servicedesk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shatrov.servicedesk.entity.Company;
import ru.shatrov.servicedesk.repository.CompanyRepository;
import ru.shatrov.servicedesk.service.CompanyService;

import java.util.List;
import java.util.Optional;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository repository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Company> save(Company company) {
        return Optional.of(repository.save(company));
    }

    @Override
    public List<Company> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Company> findByName(String name) {
        return repository.findByName(name);
    }
}
