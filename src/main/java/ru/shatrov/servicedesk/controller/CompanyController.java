package ru.shatrov.servicedesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.shatrov.servicedesk.dto.CompanyDto;
import ru.shatrov.servicedesk.entity.Company;
import ru.shatrov.servicedesk.service.CompanyService;

import java.util.List;
import java.util.Optional;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
@RestController
@RequestMapping("/company")
public class CompanyController extends AbstractController<Company, CompanyService> {

    @Autowired
    public CompanyController(CompanyService service) {
        super(service);
    }

    @GetMapping("/findByName")
    public List<Company> findByName(@RequestParam String name) {
        return service.findByName(name);
    }

    @PostMapping(value = "/save2",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Company> save2(@RequestBody CompanyDto companyDto) {
        Company company = new Company(companyDto.getName(), companyDto.getInn());
        Optional<Company> result = service.save(company);
        return result.map(ResponseEntity::ok)
                .orElseThrow();
    }
}
