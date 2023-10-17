package com.aditya.TestApplication.controller;

import com.aditya.TestApplication.entitiy.Employee;
import com.aditya.TestApplication.service.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * @author adityagupta
 * @date 06/08/23
 */
@RestController
@RequestMapping("/employee")
public class RestEmployeeController {

    private final EmployeeService employeeService = new EmployeeService();

    @GetMapping("")
    public List<Employee> allEmployee(){
        return employeeService.gettingAllEmployee();
    }


    @GetMapping("/getEmployee")
    public Employee getEmployeeController(@RequestParam(name="id") int id){
        return employeeService.gettingEmployee(id);
    }

    @PostMapping("/addEmployee")
    public String addEmployeeController(@RequestBody Employee emp){
        employeeService.addingEmployee(emp);
        return "added";
    }

    @GetMapping("/removeEmployee/{id}")
    public String removingEmployee(@PathVariable("id") int id){
        Employee emp = employeeService.gettingEmployee(id);
        employeeService.removingEmployee(emp);
        return "removed";
    }

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(required = false) String name){
        return "hello "+ name;
    }
}
