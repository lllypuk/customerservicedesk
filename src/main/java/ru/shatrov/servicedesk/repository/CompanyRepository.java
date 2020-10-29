package ru.shatrov.servicedesk.repository;

import org.springframework.stereotype.Repository;
import ru.shatrov.servicedesk.entity.Company;

import java.util.List;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
@Repository
public interface CompanyRepository extends CommonRepository<Company> {

    List<Company> findByName(String name);
}
