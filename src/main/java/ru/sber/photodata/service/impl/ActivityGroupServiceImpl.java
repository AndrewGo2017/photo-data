package ru.sber.photodata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sber.photodata.model.ActivityGroup;
import ru.sber.photodata.repository.ActivityGroupRepository;
import ru.sber.photodata.service.ActivityGroupService;

import java.util.List;

@Service
public class ActivityGroupServiceImpl implements ActivityGroupService {
    
    @Autowired
    private ActivityGroupRepository activityGroupRepository;
    
    @Override
    public ActivityGroup save(ActivityGroup entity) {
        return activityGroupRepository.save(entity);
    }

    @Override
    public boolean delete(long id) {
        return activityGroupRepository.delete(id) != 0;
    }

    @Override
    public ActivityGroup get(long id) {
        return activityGroupRepository.findById(id).orElse(null);
    }

    @Override
    public List<ActivityGroup> getAll() {
        return activityGroupRepository.findAll();
    }
}
