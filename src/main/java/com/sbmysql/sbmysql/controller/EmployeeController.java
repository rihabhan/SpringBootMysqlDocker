package com.sbmysql.sbmysql.controller;

import com.sbmysql.sbmysql.model.Employee;
import com.sbmysql.sbmysql.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;
    @GetMapping
    public List<Employee> getALLemployee(){
        return employeeRepo.findAll();
    }
    @PostMapping
    public Employee createEmplyee(@RequestBody Employee employee)
    {
        return employeeRepo.save(employee);
    }
}
