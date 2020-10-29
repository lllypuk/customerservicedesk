package ru.shatrov.servicedesk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import ru.shatrov.servicedesk.entity.AbstractEntity;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
public interface CommonController<E extends AbstractEntity> {

    ResponseEntity<E> save(@RequestBody E entity);
}
