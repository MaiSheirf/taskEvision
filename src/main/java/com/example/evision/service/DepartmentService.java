package com.example.evision.service;

import com.example.evision.entity.Department;

import java.util.List;

public interface DepartmentService {

    // Save operation
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);

    //find by id
    Department findByDepartmentId(long departmentId);
}
