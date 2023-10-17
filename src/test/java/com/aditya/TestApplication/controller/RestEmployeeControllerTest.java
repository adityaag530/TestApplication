package com.aditya.TestApplication.controller;

import com.aditya.TestApplication.entitiy.Employee;
import com.aditya.TestApplication.service.EmployeeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author adityagupta
 * @date 07/08/23
 */

class RestEmployeeControllerTest {

    public EmployeeService employeeService;

    @Test
    @DisplayName("adding employee test")
    void addEmployeeController() {
        employeeService = new EmployeeService();
        Employee expected = new Employee(23, "Hellow form test", "wakanda");
        employeeService.addingEmployee(expected);
        System.out.println(employeeService.gettingEmployee(expected.empId()));
        assertEquals(expected, employeeService.gettingEmployee(expected.empId()));
    }
}