package com.demo.application.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

    @GetMapping("/getAll")
    public List<EmployeeEntity> getEmployee() {
         List<EmployeeEntity> employeeEntityList = new ArrayList<>(1);
         employeeEntityList.add(new EmployeeEntity(1L, "Amit Verma", "Meerut", "U.P"));
         employeeEntityList.add(new EmployeeEntity(2L, "Amit Soni", "Meerut", "U.P"));
         employeeEntityList.add(new EmployeeEntity(3L, "Nivish Verma", "Meerut", "U.P"));
         employeeEntityList.add(new EmployeeEntity(4L, "Shubham Kumar", "Meerut", "U.P"));
         return employeeEntityList;
    }
}
