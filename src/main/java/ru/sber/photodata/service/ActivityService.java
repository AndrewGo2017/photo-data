package ru.sber.photodata.service;

import ru.sber.photodata.model.Activity;

import java.util.List;

public interface ActivityService extends BaseService<Activity> {
    List<Activity> getAllByActivityGroupId(long activityGroupId);
}
