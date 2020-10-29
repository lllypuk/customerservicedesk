package ru.shatrov.servicedesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.shatrov.servicedesk.entity.AbstractEntity;
import ru.shatrov.servicedesk.repository.CommonRepository;

import java.util.Optional;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
public abstract class AbstractService<E extends AbstractEntity, R extends CommonRepository<E>> implements CommonService<E> {

    protected final R repository;

    @Autowired
    public AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    public Optional<E> save(E entity) {
        return Optional.of(repository.save(entity));
    }
}
