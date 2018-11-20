package ru.sber.photodata.service;

import ru.sber.photodata.model.BaseEntity;

import java.util.List;

public interface BaseService<Entity extends BaseEntity> {
    Entity save(Entity entity);

    boolean delete(long id);

    Entity get(long id);

    List<Entity> getAll();
}