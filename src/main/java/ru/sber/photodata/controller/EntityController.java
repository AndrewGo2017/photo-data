package ru.sber.photodata.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sber.photodata.model.BaseEntity;
import ru.sber.photodata.to.BaseTo;

import java.util.List;

public interface EntityController<Entity extends BaseEntity> {
    @PostMapping (produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Entity create(@RequestBody Entity someEntity);

    @PutMapping( produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Entity update(@RequestBody Entity someEntity);

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
    Entity get(@PathVariable("id") long id);

    @DeleteMapping(value = "/{id}")
    boolean delete(@PathVariable("id") long id);

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<Entity> getAll();
}
