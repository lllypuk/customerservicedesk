package ru.shatrov.servicedesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.shatrov.servicedesk.entity.AbstractDocument;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
@NoRepositoryBean
public interface CommonRepository<E extends AbstractDocument> extends MongoRepository<E, String> {
}
