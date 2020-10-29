package ru.shatrov.servicedesk.service;

import ru.shatrov.servicedesk.entity.AbstractEntity;
import ru.shatrov.servicedesk.entity.Company;

import java.util.List;
import java.util.Optional;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
public interface CommonService<E extends AbstractEntity> {

    Optional<E> save(E entity);
}
