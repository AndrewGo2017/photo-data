package ru.sber.photodata.controller;

import org.springframework.web.bind.annotation.*;
import ru.sber.photodata.model.User;
import ru.sber.photodata.service.BaseService;

@RestController
@RequestMapping("/user")
public class UserController extends EntityControllerImpl<User> {

    public UserController(BaseService<User> baseService){
        super(baseService);
    }
}
