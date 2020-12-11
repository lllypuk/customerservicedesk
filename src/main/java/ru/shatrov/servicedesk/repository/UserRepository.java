package ru.shatrov.servicedesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.shatrov.servicedesk.entity.User;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
