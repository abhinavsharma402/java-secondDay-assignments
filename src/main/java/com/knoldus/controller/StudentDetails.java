package com.knoldus.controller;

import com.knoldus.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentDetails {

    public List<Student> getStudentsNotHaveSecondaryAddress(List<Student> list) {

        return list.stream()
                .filter(student -> !student.getAddress().getSecondaryAddress()
                        .isPresent()).collect(Collectors.toList());
    }

    public List<Student> getStudentsWithSpecifiedAddressAndName(List<Student> list) {

        return list.stream()
                .filter(student -> !student.getAddress().getSecondaryAddress()
                        .isPresent() && student.getName().startsWith("A"))
                .collect(Collectors.toList());
    }
}
