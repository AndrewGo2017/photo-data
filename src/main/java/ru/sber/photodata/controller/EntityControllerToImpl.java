package ru.sber.photodata.controller;

import ru.sber.photodata.model.BaseEntity;
import ru.sber.photodata.service.BaseService;
import ru.sber.photodata.service.BaseServiceTo;
import ru.sber.photodata.to.BaseTo;

import java.util.List;

public class EntityControllerToImpl<Entity extends BaseEntity, EntityTo extends BaseTo> implements EntityControllerTo<Entity, EntityTo> {
    private final BaseServiceTo<Entity, EntityTo> service;

    public EntityControllerToImpl(BaseServiceTo<Entity, EntityTo> service){
        this.service = service;
    }

    @Override
    public void create(EntityTo someEntity) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.save(someEntity);
    }

    @Override
    public void update(EntityTo someEntity) {
        service.save(someEntity);
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