package ru.sber.photodata.controller;

import org.springframework.web.bind.annotation.*;
import ru.sber.photodata.model.Activity;
import ru.sber.photodata.service.BaseService;

@RestController
@RequestMapping("/activity")
public class ActivityController  extends EntityControllerImpl<Activity> {

    public ActivityController(BaseService<Activity> baseService){
        super(baseService);
    }
}
