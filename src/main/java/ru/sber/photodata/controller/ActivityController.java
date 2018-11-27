package ru.sber.photodata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sber.photodata.model.Activity;
import ru.sber.photodata.service.ActivityService;
import ru.sber.photodata.service.BaseService;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController  extends EntityControllerImpl<Activity> {

    @Autowired
    private ActivityService activityService;

    @Autowired
    public ActivityController(BaseService<Activity> baseService){
        super(baseService);
    }

    @GetMapping(value = "/activityGroup/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Activity> getAllByActivityGroupId(@PathVariable("id") long activityGroupId){
        return activityService.getAllByActivityGroupId(activityGroupId);
    }
}
