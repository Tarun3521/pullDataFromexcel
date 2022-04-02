package com.example.demo.service;

import com.example.demo.entity.EmployeeData;
import com.poiji.bind.Poiji;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {


    public List<EmployeeData> getEmployeeData() {
        File file = new File("src/main/resources/sample.xlsx");
        List<EmployeeData> invoices = Poiji.fromExcel(file, EmployeeData.class);
            return  invoices.stream().limit(2).collect(Collectors.toList());
    }
}
