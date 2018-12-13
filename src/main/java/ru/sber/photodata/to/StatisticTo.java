package ru.sber.photodata.to;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class StatisticTo extends BaseTo {

    private Long user;

    private Long activity;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate date;

    @DateTimeFormat(pattern = "HH:mm:ss")
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime time;

    public StatisticTo(Long id, Long user, Long activity, LocalDate date, LocalTime time) {
        super(id);
        this.user = user;
        this.activity = activity;
        this.date = date;
        this.time = time;
    }
}
