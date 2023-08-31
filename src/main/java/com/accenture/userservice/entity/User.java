package com.accenture.userservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "USER_TABLE")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private String dob;
    private String mobileno;
    private String gender;
    private String hno;
    private String town;
    private String city;
    private String state;
    private String pincode;
}
