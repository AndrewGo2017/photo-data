package ru.sber.photodata.service;

import ru.sber.photodata.model.Statistic;
import ru.sber.photodata.to.UserStatisticTimeTo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface StatisticService extends BaseService<Statistic> {
    LocalTime getTotalDayTime(long userId);

    List<UserStatisticTimeTo> getAllUserTotalDayTime(LocalDate from, LocalDate to);

    List<UserStatisticTimeTo> getAllUserTotalDayTimeWithActivityDetails(LocalDate from, LocalDate to);
}
