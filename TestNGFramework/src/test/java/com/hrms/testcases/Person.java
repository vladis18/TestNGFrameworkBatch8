package com.hrms.testcases;

import org.apache.poi.ss.usermodel.Cell;

public class Person {
    String firstName;
    String lastName;
    int age;
    ;

//    public Person(String firstName,String lastName, int age){
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.age= age;
//    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }


    public void setAge(int age) {
        this.age=age;
    }
}
