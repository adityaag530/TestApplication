package com.aditya.TestApplication;
/*
 * @author adityagupta
 * @date 06/08/23
 */

import com.aditya.TestApplication.entitiy.Employee;
import com.aditya.TestApplication.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Random;

@Configuration
public class AddingRandomEmployeeData {

    @Bean
    public static EmployeeService addingEmployee(){
        final Random random = new Random();
        final EmployeeService employeeService = new EmployeeService();

        for(int i=0; i<5; i++){
            int id = random.nextInt();
            String name = String.valueOf((char)random.nextInt());
            String location = String.valueOf((char)random.nextInt());
            Employee emp = new Employee(id, name, location);
            employeeService.addingEmployee(emp);
        }

        return employeeService;
    }
}
