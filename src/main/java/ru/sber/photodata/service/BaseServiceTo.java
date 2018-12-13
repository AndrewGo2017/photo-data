package ru.sber.photodata.service;

import ru.sber.photodata.model.BaseEntity;
import ru.sber.photodata.to.BaseTo;

import java.util.List;

public interface BaseServiceTo<Entity extends BaseEntity, EntityTo extends BaseTo> {
    Entity save(EntityTo entity);

    boolean delete(long id);

    Entity get(long id);

    List<Entity> getAll();
}