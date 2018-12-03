package ru.sber.photodata.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sber.photodata.model.BaseEntity;

import java.util.List;

public interface EntityController <T extends BaseEntity> {
    @PostMapping
    T create( T someEntity);

    @PutMapping
    T update( T someEntity);

    @GetMapping(value = "/{id}")
    T get(@PathVariable("id") long id);

    @DeleteMapping(value = "/{id}")
    boolean delete(@PathVariable("id") long id);

    @GetMapping
    List<T> getAll();
}
