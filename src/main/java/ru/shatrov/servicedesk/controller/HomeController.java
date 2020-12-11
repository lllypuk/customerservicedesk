package ru.shatrov.servicedesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author Shatrov create date 11.12.2020
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
