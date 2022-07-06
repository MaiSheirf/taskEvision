package com.example.evision.controller;

import com.example.evision.entity.Department;
import com.example.evision.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //save data
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside save department of controller");
        return departmentService.saveDepartment(department);
    }

    //find by id
    @GetMapping("/{id}")
    public Department findByDepartmentId ( @PathVariable("id") Long departmentId){
        log.info("inside find department by id of controller");
        return departmentService.findByDepartmentId(departmentId);

    }
    // Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        log.info("inside return list of controller");
        return departmentService.fetchDepartmentList();
    }

    // Update operation
    @RequestMapping(value = "/departments/{id}",
            method=RequestMethod.PUT)
    public  Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        log.info("inside update of controller");
        return departmentService.updateDepartment(
                department, departmentId);
    }

    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                               Long departmentId)
    {
        log.info("inside delete of controller");
        departmentService.deleteDepartmentById(
                departmentId);
        return "Deleted Successfully";
    }
}

