package ru.shatrov.servicedesk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.shatrov.servicedesk.entity.Company;
import ru.shatrov.servicedesk.service.CompanyService;

import java.util.List;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
@RestController
@RequestMapping("/company")
public class CompanyController extends AbstractController<Company, CompanyService> {

    public CompanyController(CompanyService service) {
        super(service);
    }

    @GetMapping("/findByName")
    public List<Company> findByName(@RequestParam String name) {
        return service.findByName(name);
    }
}
