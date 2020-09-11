package ru.shatrov.servicedesk.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public abstract class AbstractEntity {

    LocalDateTime createDateTime;
    LocalDateTime updateDateTime;
    List<History> histories = new ArrayList<>();
}
