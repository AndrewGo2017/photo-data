package ru.sber.photodata.controller;

import org.springframework.web.bind.annotation.*;
import ru.sber.photodata.model.ActivityGroup;
import ru.sber.photodata.service.BaseService;

@RestController
@RequestMapping("/activityGroup")
public class ActivityGroupController extends EntityControllerImpl<ActivityGroup> {

    public ActivityGroupController(BaseService<ActivityGroup> service) {
        super(service);
    }
}
