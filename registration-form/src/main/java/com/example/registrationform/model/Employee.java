package com.example.registrationform.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    String firstName;
    String lastName;
    String userName;
    String password;
    String address;
    String contact;
}
