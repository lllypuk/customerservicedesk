package ru.shatrov.servicedesk.service;

import ru.shatrov.servicedesk.entity.Company;

import java.util.List;
import java.util.Optional;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
public interface CompanyService {

    Optional<Company> save(Company company);

    List<Company> findAll();

    List<Company> findByName(String name);
}
