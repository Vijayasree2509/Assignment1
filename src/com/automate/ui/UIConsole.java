package com.automate.ui;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.automate.Controller.EmployeeController;
import com.automate.model.Employee;
import com.automate.service.EmployeeIdGenerator;

public class UIConsole {

    private static Scanner scanner = new Scanner(System.in);
    private static final List<Employee> employees = new ArrayList<>();

    private static EmployeeController employeeController=new EmployeeController();
    public static void main(String[] args) {

        while(true) {
            int userChoice = choices();
            options(userChoice);
        }
    }
    private static int choices(){
        System.out.println("1.Create Employee");
        System.out.println("2.Update Employee");
        System.out.println("3.Delete Employee");
        System.out.println("4.List of Employee");
        System.out.println("Enter your choice");
        return scanner.nextInt();

    }
    private static void options(int userChoice){

    switch (userChoice){
            case 1:
                employeeController.createEmployee(takeName(),takeAge(),takeSalary());
                break;

            case 2:
                System.out.println("Enter the update details");
                employeeController.updateEmployee(takeId(),takeName(),takeAge(),takeSalary());
                break;
            case 3:
                System.out.println("Enter the employee Id");
                employeeController.deleteEmployee(takeId());
            case 4:
                System.out.println(employeeController.listEmployee());
                break;

        }


    }
    private static String takeName(){
        System.out.println("Name:");
        return scanner.next();
    }
    private static int takeAge(){
        System.out.println("Age:");
        return scanner.nextInt();
    }
    private static int takeSalary(){
        System.out.println("Salary:");
        return scanner.nextInt();
    }
    private static int takeId(){
        int employeeId=scanner.nextInt();
        return employeeId;
    }
}
