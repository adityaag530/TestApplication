package com.aditya.TestApplication.service;
/*
 * @author adityagupta
 * @date 06/08/23
 */


import com.aditya.TestApplication.entitiy.Employee;
import com.aditya.TestApplication.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    public final EmployeeRepository employeeRepository;

    public EmployeeService(){
        employeeRepository = new EmployeeRepository();
    }

    public void addingEmployee(Employee employee){
        employeeRepository.addEmployee(employee);
    }

    public void removingEmployee(Employee employee){
        employeeRepository.removeEmployee(employee);
    }

    public Employee gettingEmployee(int id) {
        return employeeRepository.getEmployee(id);
    }

    public List<Employee> gettingAllEmployee() {
        return employeeRepository.getAll();
    }
}
