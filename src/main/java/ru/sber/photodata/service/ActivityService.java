package ru.sber.photodata.service;

import ru.sber.photodata.model.Activity;
import ru.sber.photodata.to.ActivityTo;

import java.util.List;

public interface ActivityService extends BaseServiceTo<Activity, ActivityTo> {
    List<Activity> getAllByActivityGroupId(long activityGroupId);
}
