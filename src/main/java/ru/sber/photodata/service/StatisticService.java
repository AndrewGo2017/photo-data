package ru.sber.photodata.service;

import ru.sber.photodata.model.Statistic;
import ru.sber.photodata.to.StatisticTo;
import ru.sber.photodata.to.UserStatisticTimeTo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface StatisticService extends BaseServiceTo<Statistic, StatisticTo> {
    LocalTime getTotalDayTime(long userId);

    List<UserStatisticTimeTo> getAllUserTotalDayTime(LocalDate from, LocalDate to);

    List<UserStatisticTimeTo> getAllUserTotalDayTimeWithActivityDetails(LocalDate from, LocalDate to);
}
