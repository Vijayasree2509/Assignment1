package com.automate;
import com.automate.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
public class Platform {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        /*createEmployee();
        while(true){
            int userChoice = getAskUserChoice();
            processUserChoice(userChoice);
        }

    }

    private static int getAskUserChoice(){
        System.out.println("1.Add an Employee");
        System.out.println("2.Update Employee");
        System.out.println("3.Delete Employee");
        System.out.println("4.List Employee");
        System.out.println("Enter your choice");
        return scanner.nextInt();
    }
    private static void processUserChoice(int userChoice){
        switch (userChoice){
            case 1:
                final Employee employee = createEmployee();
                employees.add(employee);
                employee.displayInformation();
                break;
            case 2:
                System.out.println("Which employee need to be updated");
                updateEmployee(scanner.nextInt());
                break;
            case 3:
                System.out.println("Enter Id to delete");
                int employeeId=scanner.nextInt();
                deleteEmployeeById(employeeId);
                break;
            case 4:
                listEmployee();
                break;
        }
    }



    private static int takeAge(){
        System.out.println("Age:");
        return scanner.nextInt();
    }

    private static String takeName(){
        System.out.println("Name");
        return scanner.next();
    }
    private static int takeSalary(){
        System.out.println("Salary");
        return scanner.nextInt();
    }

    private static Employee createEmployee(){
        System.out.println("Provide Employee details");
        final String name = takeName();
        final int salary = takeSalary();
        final int age = takeAge();
        Employee employee = createEmployeeObject(name,salary,age);
       /* employee.displayInformation();
        return employee;
    }
    private static int identifier=1;

    private static Employee createEmployeeObject(String name,int salary,int age){

        return new Employee(name,salary,identifier++,age);
    }

    private static void listEmployee(){
        for(Employee e:employees)
            e.displayInformation();
    }

    static void deleteEmployeeById(int employeeId){
        for(int i=0;i<employees.size();i++){
            if(employees.get(i).getUniqueIdentifier()==employeeId){
                employees.remove(i);
                System.out.println("Employee with Id: "+employeeId+ "is deleted");
                break;
            }
        }
    }

    private static void updateEmployee(int employeeId){
        System.out.println("Enter the updated information with employee Id");
        final String name = takeName();
        final int salary = takeSalary();
        final int age = takeAge();
        for(int i=0;i<employees.size();i++){
            if(employees.get(i).getUniqueIdentifier()==employeeId){
                employees.get(i).update(name,salary,age);
                break;
            }
        }


    }
}*/
