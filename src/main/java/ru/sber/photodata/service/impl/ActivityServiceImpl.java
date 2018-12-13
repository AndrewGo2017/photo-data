package ru.sber.photodata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sber.photodata.model.Activity;
import ru.sber.photodata.repository.ActivityGroupRepository;
import ru.sber.photodata.repository.ActivityRepository;
import ru.sber.photodata.service.ActivityService;
import ru.sber.photodata.to.ActivityTo;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    @Autowired
    private ActivityGroupRepository activityGroupRepository;

    @Override
    public boolean delete(long id) {
        return activityRepository.delete(id) != 0;
    }

    @Override
    public Activity get(long id) {
        return activityRepository.findById(id).orElse(null);
    }

    @Override
    public List<Activity> getAll() {
        return activityRepository.findAll();
    }

    @Override
    public List<Activity> getAllByActivityGroupId(long activityGroupId) {
        return activityRepository.getAllByActivityGroup_Id(activityGroupId);
    }

    @Override
    public Activity save(ActivityTo activityTo) {

        Activity activity = new Activity(
                activityTo.getId(),
                activityGroupRepository.getOne(activityTo.getActivityGroup()),
                activityTo.getName(),
                activityTo.isActive()
        );

        return activityRepository.save(activity);
    }
}
