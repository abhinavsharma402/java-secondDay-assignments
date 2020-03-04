package com.knoldus.view;

import com.knoldus.controller.*;
import com.knoldus.model.Address;
import com.knoldus.model.LeapYear;
import com.knoldus.model.ManLivedSeconds;
import com.knoldus.model.Student;

import java.io.IOException;
import java.time.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.time.ZoneOffset.UTC;

public class Driver {
    public static void main(String[] args) throws IOException {
        ZoneTime zoneTimeObj = new ZoneTime();
        String zone = "Australia/Sydney";
        System.out.println(zoneTimeObj.getZoneTime(zone));
//       ZonedDateTime localDate = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
//        System.out.println(localDate.withZoneSameInstant(UTC));
        ManLivedSeconds manLivedSecondsObj = new ManLivedDuration();
        LocalDate birthDate = LocalDate.of(1997, 2,2);
        LocalDate deathDate = LocalDate.of(2016, 3, 3);


        System.out.println(manLivedSecondsObj.getManLivedSeconds(birthDate, deathDate));
        LeapYear leapYearObj = new LeapYearAfterRepublic();
        int startYear = 1950;
        int endYear = 2021;
        int date = 26;
        int month = 1;
        System.out.println(leapYearObj.getLeapYearsAfterFirstRepublic(startYear, endYear, month, date));
        Address address1 = new Address("agra", Optional.of("delhi"));
        Address address2 = new Address("mathura", Optional.empty());
        Student student1 = new Student("Abhinav", 1, 22, address1);
        Student student2 = new Student("Akash", 1, 22, address2);
        Student student3 = new Student("krish", 1, 22, address2);
        List<Student> list = Arrays.asList(student1);
        StudentDetails studentDetailsObj = new StudentDetails();
        studentDetailsObj.getStudentsNotHaveSecondaryAddress(list).stream()
                .forEach(student ->
                        System.out.println(student.getName() + " " + student.getAddress().getSecondaryAddress()
                                + " " + student.getId() + " " + student.getAge()));
        studentDetailsObj.getStudentsWithSpecifiedAddressAndNAme(list).stream()
                .forEach(student ->
                        System.out.println(student.getName() + " " + student.getAddress().getSecondaryAddress()
                                + " " + student.getId() + " " + student.getAge()));
        FileOperations fileOperationsObj = new FileOperations();
       List<String> content= fileOperationsObj.readData("src/main/resources/Demo");
       System.out.println(fileOperationsObj.getWordsCount(content));

       BirthDateDays birthDateDaysObj = new BirthDateDays();
        LocalDate localDate = LocalDate.of(1996, 06, 04);
        List<DayOfWeek> emptyList = new LinkedList<>();
        System.out.println(birthDateDaysObj.getBirthDateDays(localDate, emptyList));
    }

}
