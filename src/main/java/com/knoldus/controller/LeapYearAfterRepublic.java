package com.knoldus.controller;

import com.knoldus.model.LeapYear;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeapYearAfterRepublic implements LeapYear {
    @Override
    public List<Integer> getLeapYearsAfterFirstRepublic(int startYear, int endYear,int month,int date) {
        List<Integer> leapYearList = IntStream.range(startYear, endYear)
                .filter(year -> LocalDate.of(year, month, date).isLeapYear()).boxed().collect(Collectors.toList());
        return leapYearList;
    }


}
