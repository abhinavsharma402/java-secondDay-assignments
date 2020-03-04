package com.knoldus.view;

import com.knoldus.controller.FileOperations;
import com.knoldus.controller.LeapYearAfterRepublic;
import com.knoldus.controller.ManLivedDuration;

import com.knoldus.controller.ZoneTime;
import com.knoldus.controller.BirthDateDays;
import com.knoldus.controller.StudentDetails;
import com.knoldus.model.Address;
import com.knoldus.model.LeapYear;
import com.knoldus.model.ManLivedSeconds;
import com.knoldus.model.Student;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Driver {
    public static void main(String[] args) throws IOException {
        System.out.println("-------------Question3-------------");
        ZoneTime zoneTimeObj = new ZoneTime();
        String zone = "Australia/Sydney";
        System.out.println(zoneTimeObj.getZoneTime(zone));
        System.out.println("-------------Question4-------------");
        ManLivedSeconds manLivedSecondsObj = new ManLivedDuration();
        LocalDate birthDate = LocalDate.of(1997, 2, 2);
        LocalDate deathDate = LocalDate.of(2016, 3, 3);

        System.out.println(manLivedSecondsObj.getManLivedSeconds(birthDate, deathDate));
        System.out.println("-------------Question5-------------");
        LeapYear leapYearObj = new LeapYearAfterRepublic();
        int startYear = 1950;
        int endYear = 2021;
        int date = 26;
        int month = 1;
        System.out.println(leapYearObj.getLeapYearsAfterFirstRepublic(startYear, endYear, month, date));

        System.out.println("-------------Question1-------------");
        Address address1 = new Address("agra", Optional.of("delhi"));
        Address address2 = new Address("mathura", Optional.empty());
        Student student1 = new Student("Abhinav", 1, 22, address1);
        Student student2 = new Student("Akash", 1, 22, address2);
        Student student3 = new Student("krish", 1, 22, address2);
        List<Student> list = Arrays.asList(student1, student2, student3);
        StudentDetails studentDetailsObj = new StudentDetails();
        studentDetailsObj.getStudentsNotHaveSecondaryAddress(list).stream()
                .forEach(student ->
                        System.out.println(student.getName() + " " + student.getAddress().getSecondaryAddress()
                                + " " + student.getId() + " " + student.getAge()));
        studentDetailsObj.getStudentsWithSpecifiedAddressAndName(list).stream()
                .forEach(student ->
                        System.out.println(student.getName() + " " + student.getAddress().getSecondaryAddress()
                                + " " + student.getId() + " " + student.getAge()));
        System.out.println("-------------Question6-------------");
        FileOperations fileOperationsObj = new FileOperations();
        try {
            List<String> content = fileOperationsObj.readData("src/main/resources/Demo");
            System.out.println(fileOperationsObj.getWordsCount(content));
        } catch (IOException io) {
            io.getMessage();
        }
        System.out.println("-------------Question2-------------");
        BirthDateDays birthDateDaysObj = new BirthDateDays();
        LocalDate localDate = LocalDate.of(1996, 06, 04);
        List<DayOfWeek> emptyList = new LinkedList<>();
        System.out.println(birthDateDaysObj.getBirthDateDays(localDate, emptyList));
    }

}
