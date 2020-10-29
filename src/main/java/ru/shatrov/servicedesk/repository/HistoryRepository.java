package ru.shatrov.servicedesk.repository;

import org.springframework.stereotype.Repository;
import ru.shatrov.servicedesk.entity.History;

/**
 * Created on 29.10.2020.
 *
 * @author Shatrov Aleksandr
 */
@Repository
public interface HistoryRepository extends CommonRepository<History> {
}
