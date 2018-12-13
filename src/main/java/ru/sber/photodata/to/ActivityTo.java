package ru.sber.photodata.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class ActivityTo extends BaseTo {
    private Long activityGroup;

    private String name;

    private boolean isActive;

    public ActivityTo(Long id, Long activityGroup, String name, boolean isActive) {
        super(id);
        this.activityGroup = activityGroup;
        this.name = name;
        this.isActive = isActive;
    }
}
