package com.hasity.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class User {
    
    private String id;
    
    private String name;
    
    private Integer age;
    
    private Date birthday;
    
    private Department department;
    
    // getter setter equals hashcode toString
}