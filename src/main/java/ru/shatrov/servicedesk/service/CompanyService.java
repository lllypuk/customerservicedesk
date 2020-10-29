package ru.shatrov.servicedesk.service;

import org.springframework.stereotype.Service;
import ru.shatrov.servicedesk.entity.Company;
import ru.shatrov.servicedesk.repository.CompanyRepository;

import java.util.List;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
@Service
public class CompanyService extends AbstractService<Company, CompanyRepository> {

    public CompanyService(CompanyRepository repository) {
        super(repository);
    }

    public List<Company> findByName(String name) {
        return repository.findByName(name);
    }
}
