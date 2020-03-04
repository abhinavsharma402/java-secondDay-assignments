package com.knoldus.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class BirthDateDays {
    public List<DayOfWeek> getBirthDateDays(LocalDate date, List<DayOfWeek> list1) {
        if (date.getYear() == LocalDate.now().getYear()) {
            return list1;
        } else {
            list1.add(date.getDayOfWeek());


            return getBirthDateDays(date.plusYears(1), list1);
        }
    }
}
