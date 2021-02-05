package com.automate.service;
import com.automate.model.Employee;
import com.automate.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;



public class EmployeeService {


    private int uniqueIdentifier;
    private EmployeeRepository employeeRepository=new EmployeeRepository();
    public int createEmployee(String name,int age,int salary) {
      final int uniqueIdentifier=EmployeeIdGenerator.EmployeeId();
        Employee employee = new Employee(name,salary,age,uniqueIdentifier);
        EmployeeRepository.save(employee);
        employee.displayInformation();
        return uniqueIdentifier;
    }
    public void updateEmployee(int employeeId,String name,int age,int salary){
        final int uniqueIdentifier=EmployeeIdGenerator.EmployeeId();
        Employee employee = employeeRepository.retrieve(employeeId);
        employee.update(name,age,salary);
        employeeRepository.save(employee);
        employee.displayInformation();
    }
    public void deleteEmployee(int employeeId){
    employeeRepository.delete(employeeId);
    }
    public List<Employee> listEmployee(){
        List<Employee> employee= employeeRepository.fetchAll();

        return employee;

    }
}
