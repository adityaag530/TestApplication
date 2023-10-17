package com.aditya.TestApplication.repository;
/*
 * @author adityagupta
 * @date 06/08/23
 */



import com.aditya.TestApplication.entitiy.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EmployeeRepository {
    final List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(Employee employee){
        employees.add(employee);
        return employee;
    }

    public String removeEmployee(Employee employee){
        employees.remove(employee);
        return "removed";
    }

    public Employee getEmployee(int id) {
        return employees.stream().filter(emp -> emp.empId()==id).findAny().orElse(null);
    }

    public List<Employee> getAll() {
        return employees;
    }
}
