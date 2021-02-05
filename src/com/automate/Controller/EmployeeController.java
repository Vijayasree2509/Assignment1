package com.automate.Controller;

import com.automate.model.Employee;
import com.automate.service.EmployeeService;

import java.util.List;

public final class EmployeeController {
    private EmployeeService employeeService=new EmployeeService();

    public int createEmployee(final String name,final int age,final int salary) {
        if (validationIsSuccess(name, age, salary))
            return employeeService.createEmployee(name, age, salary);
            return -1;
    }

    public void updateEmployee(int employeeId,String name,int age,int salary){
        if(employeeId<0){
            System.out.println("Invalid EmployeeID");
        }
        employeeService.updateEmployee(employeeId,name,age,salary);
    }

    public void deleteEmployee(int employeeId){
        employeeService.deleteEmployee(employeeId);
    }

    public List<Employee> listEmployee(){
        return employeeService.listEmployee();

    }



    private boolean validationIsSuccess(String name,int age,int salary){

        boolean validationIsSuccess = true;
        if (name == null) {
            System.out.println("Employee Name is required");
            validationIsSuccess = false;
        }
        if (age < 0) {
            System.out.println("Age is not valid");
            validationIsSuccess = false;
        }
        if (salary < 0) {
            System.out.println("salary is not valid");
            validationIsSuccess = false;
        }

        return validationIsSuccess;
        }


    }


