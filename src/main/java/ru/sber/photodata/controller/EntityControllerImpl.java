package ru.sber.photodata.controller;

import ru.sber.photodata.model.BaseEntity;
import ru.sber.photodata.service.BaseService;

import java.util.List;

public class EntityControllerImpl<Entity extends BaseEntity> implements EntityController<Entity> {
    private final BaseService<Entity> service;

    public EntityControllerImpl(BaseService<Entity> service){
        this.service = service;
    }

    @Override
    public Entity create(Entity someEntity) {
        return service.save(someEntity);
    }

    @Override
    public Entity update(Entity someEntity) {
        return service.save(someEntity);
    }

    @Override
    public Entity get(long id) {
        return service.get(id);
    }

    @Override
    public boolean delete(long id) {
        return service.delete(id);
    }

    @Override
    public List<Entity> getAll() {
        return service.getAll();
    }
}