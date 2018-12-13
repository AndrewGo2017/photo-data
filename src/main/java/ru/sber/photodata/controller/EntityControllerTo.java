package ru.sber.photodata.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sber.photodata.model.BaseEntity;
import ru.sber.photodata.to.BaseTo;

import java.util.List;

public interface EntityControllerTo<Entity extends BaseEntity, EntityTo extends BaseTo> {
    @PostMapping (consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    void create(@RequestBody EntityTo someEntity);

    @PutMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    void update(@RequestBody EntityTo someEntity);
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
    Entity get(@PathVariable("id") long id);

    @DeleteMapping(value = "/{id}")
    boolean delete(@PathVariable("id") long id);

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<Entity> getAll();
}
