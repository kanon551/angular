package com.kanon.crud.controller;

import com.kanon.crud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kanon.crud.repository.EmployeeRepository;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @CrossOrigin (origins ="http://localhost:4200")
    //@CrossOrigin(origins = "*")
    @GetMapping("/employees")
    public List<Employee> getALlEmployees(){
        return employeeRepository.findAll();
    }




}
