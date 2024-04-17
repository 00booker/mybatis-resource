package com.hasity.mybatis.service;

import com.hasity.mybatis.entity.Department;

import java.util.List;

public interface DepartmentDao {
    
    List<Department> findAll();
    
    Department findById(String id);
}