package ru.sber.photodata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sber.photodata.model.Statistic;
import ru.sber.photodata.service.BaseService;
import ru.sber.photodata.service.BaseServiceTo;
import ru.sber.photodata.service.StatisticService;
import ru.sber.photodata.to.StatisticTo;
import ru.sber.photodata.to.UserStatisticTimeTo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/statistic")
public class StatisticController extends EntityControllerToImpl<Statistic, StatisticTo> {

    @Autowired
    private StatisticService statisticService;

    public StatisticController(BaseServiceTo<Statistic, StatisticTo> service) {
        super(service);
    }

    @GetMapping("/total-day-details/{from}/{to}")
    public List<UserStatisticTimeTo> getAllUserTotalDayTimeWithActivityDetails(
                                                          @PathVariable("from") @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate from,
                                                          @PathVariable("to") @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate to){
        return statisticService.getAllUserTotalDayTimeWithActivityDetails(from, to);
    }

    @GetMapping("/total-day/{from}/{to}")
    public List<UserStatisticTimeTo> getAllUserTotalDayTime(
            @PathVariable("from") @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate from,
            @PathVariable("to") @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate to){
        return statisticService.getAllUserTotalDayTime(from, to);
    }

    @GetMapping("/total-day-time/{userId}")
    public @DateTimeFormat(pattern = "HH:ss:mm") LocalTime getTotalDayTime(
            @PathVariable("userId") Long userId){
        return statisticService.getTotalDayTime(userId);
    }
}