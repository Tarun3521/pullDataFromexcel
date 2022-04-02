package com.example.demo.controller;

import com.example.demo.entity.EmployeeData;
import com.example.demo.service.EmployeeService;
import com.poiji.bind.Poiji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/EmployeeData")
public List<EmployeeData> getEmployeedata(){
    List<EmployeeData> employeeDataList= new ArrayList<>();
    return employeeService.getEmployeeData();
}

}
