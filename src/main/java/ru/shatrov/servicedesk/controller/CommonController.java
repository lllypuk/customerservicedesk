package ru.shatrov.servicedesk.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.shatrov.servicedesk.entity.AbstractEntity;

import java.util.List;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
public interface CommonController<E extends AbstractEntity> {

    @PostMapping(value = "/save",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<E> save(@RequestBody E entity);

    @GetMapping("/findAll")
    List<E> findAll();
}
