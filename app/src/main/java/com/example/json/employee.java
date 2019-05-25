package com.example.json;

import java.util.List;

public class employee {

    String firstname;
    int age;
    String email;
    Address address;
    List<FamilyMember> employees;
    public employee(String firstname, int age, String email, Address address, List<FamilyMember> employees)  {
        this.firstname = firstname;
        this.age = age;
        this.email = email;
        this.address=address;
        this.employees= employees;
    }
}
