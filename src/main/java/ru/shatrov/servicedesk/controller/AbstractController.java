package ru.shatrov.servicedesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import ru.shatrov.servicedesk.entity.AbstractEntity;
import ru.shatrov.servicedesk.service.CommonService;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
public abstract class AbstractController<E extends AbstractEntity, S extends CommonService<E>> implements CommonController<E> {

    protected final S service;

    @Autowired
    public AbstractController(S service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<E> save(@RequestBody E entity) {
        return service.save(entity).map(ResponseEntity::ok).orElseThrow();
    }
}
