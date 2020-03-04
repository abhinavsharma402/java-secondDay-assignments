package com.knoldus.controller;



import com.knoldus.model.Users;
import edu.emory.mathcs.backport.java.util.LinkedList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CrudOperations {
    public List<Users> create(Users user){
    List<Users> userList= new LinkedList();
     userList.add(user);
     return userList;
    }
    public List<String> read(List<Users> userList){
       return userList.stream().map(user -> user.getName() + " "
                + user.getAddress() + " " + user.getAge() + " "
                + user.getId()).collect(Collectors.toList());
    }
    public List<Users> update(List<Users> userList,Users user){
       userList.add(user);
        return userList;
    }
    public List<Users> delete(List<Users> userList,Users user){
        userList.remove(user);
        return userList;
    }
}
