package ru.sber.photodata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sber.photodata.model.Statistic;
import ru.sber.photodata.repository.ActivityRepository;
import ru.sber.photodata.repository.StatisticRepository;
import ru.sber.photodata.repository.UserRepository;
import ru.sber.photodata.service.StatisticService;
import ru.sber.photodata.to.StatisticTo;
import ru.sber.photodata.to.UserStatisticTimeTo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private StatisticRepository statisticRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public boolean delete(long id) {
        return statisticRepository.delete(id) != 0;
    }

    @Override
    public Statistic get(long id) {
        return statisticRepository.findById(id).orElse(null);
    }

    @Override
    public List<Statistic> getAll() {
        return statisticRepository.findAll();
    }

    @Override
    public LocalTime getTotalDayTime(long userId) {
        return statisticRepository.getTotalDayTime(userId, LocalDate.now()).orElse(LocalTime.of(0,0,0));
    }

    @Override
    public List<UserStatisticTimeTo> getAllUserTotalDayTime(LocalDate from, LocalDate to){
        return statisticRepository.getAllUserTotalDayTime(from, to);
    }

    @Override
    public List<UserStatisticTimeTo> getAllUserTotalDayTimeWithActivityDetails(LocalDate from, LocalDate to) {
        return statisticRepository.getAllUserTotalDayTimeWithActivityDetails(from, to);
    }

    @Override
    public Statistic save(StatisticTo entity) {
        Statistic statistic = new Statistic(
                entity.getId(),
                userRepository.getOne(entity.getUser()),
                activityRepository.getOne(entity.getActivity()),
                entity.getDate(),
                entity.getTime()
        );

        return statisticRepository.save(statistic);
    }
}
