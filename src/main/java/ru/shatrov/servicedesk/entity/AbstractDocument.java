package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Абстрактная сущность
 */
@Getter
@Setter
public abstract class AbstractDocument implements Serializable {

    @Id
    private String id;
    private LocalDateTime createDateTime = LocalDateTime.now();
    private LocalDateTime deleteDateTime;

    public String getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.id == null
                || obj == null
                || !(this.getClass().equals(obj.getClass()))) {
            return false;
        }

        AbstractDocument that = (AbstractDocument) obj;

        return this.id.equals(that.getId());
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }
}
