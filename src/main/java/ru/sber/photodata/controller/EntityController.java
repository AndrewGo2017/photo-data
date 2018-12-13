package ru.sber.photodata.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sber.photodata.model.BaseEntity;

import java.util.List;

public interface EntityController<T extends BaseEntity> {
    @PostMapping (produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    T create(@RequestBody T someEntity);

    @PutMapping( produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    T update(@RequestBody T someEntity);

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
    T get(@PathVariable("id") long id);

    @DeleteMapping(value = "/{id}")
    boolean delete(@PathVariable("id") long id);

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<T> getAll();
}
