package com.knoldus.controller;

import com.knoldus.model.ManLivedSeconds;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ManLivedDuration implements ManLivedSeconds {

    @Override
    public long getManLivedSeconds(LocalDate birthDate, LocalDate deathDate) {

        LocalDateTime birthDateTime = birthDate.atTime(1, 2);
        LocalDateTime deathDateTime = deathDate.atTime(1, 2);
        Duration duration = Duration.between(birthDateTime, deathDateTime);
        return duration.getSeconds();

    }

}
