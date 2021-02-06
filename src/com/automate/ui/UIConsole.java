package com.automate.ui;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.automate.Controller.EmployeeController;
import com.automate.Controller.ProjectController;
import com.automate.model.Employee;

public class UIConsole {

    private static Scanner scanner = new Scanner(System.in);
    private static final List<Employee> employees = new ArrayList<>();
    private static ProjectController projectController=new ProjectController();
    private static EmployeeController employeeController=new EmployeeController();
    private static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/mm/yyyy");
    public static void main(String[] args) {

            while(true) {
                int userChoice = choices();
                options(userChoice);
            }
          //  int userChoiceEmployee = choicesForEmployee();
            //optionsForEmployee(userChoiceEmployee);
          //  int userChoiceProject=choicesForProject();
           // optionsForProject(userChoiceProject);


        }


    private static int choicesForEmployee() {
        System.out.println("1.Create Employee");
        System.out.println("2.Update Employee");
        System.out.println("3.Delete Employee");
        System.out.println("4.List of Employee");
        System.out.println("Enter your choice");
        return scanner.nextInt();
    }
    private static int choicesForProject(){
        System.out.println("1.Create Project");
        System.out.println("2.List of Projects");
        System.out.println("3.Add Employees to the Project");
        System.out.println("4.Remove Employees to the Project");
        System.out.println("5.Delete Project");
        System.out.println("6.List Employees to the given Project");
        System.out.println("Enter your choice");
        return scanner.nextInt();

    }
    private static int choices(){
        System.out.println("EmployeeDetails:");
        System.out.println("ProjectDetails");
        System.out.println("Enter your choice");
        return scanner.nextInt();
    }
    private static void options(int userChoices) throws ParseException {
        while (true) {
            switch (userChoices) {
                case 1:

                    int userChoiceEmployee = choicesForEmployee();
                    optionsForEmployee(userChoiceEmployee);
                    break;


            case 2:

                    int userChoiceProject = choicesForProject();
                    optionsForProject(userChoiceProject);
                    break;

        }
    }
    }




    private static void optionsForEmployee(int userChoiceEmployee){

    switch (userChoiceEmployee){
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
    private static void optionsForProject(int userChoiceProject) throws ParseException {
        switch(userChoiceProject){
            case 1:
                projectController.createProject(takeProjectName(),takeStartDate(),takeEndDate());
                break;
            case 2:
                System.out.println(projectController.listProject());
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
    private static String takeProjectName(){
        System.out.println("Name of the Project:");
        return scanner.next();
    }
    private static Date takeStartDate() throws ParseException{
        System.out.println("Enter the Date:");
        return simpleDateFormat.parse(scanner.nextLine());
    }
    private static Date takeEndDate() throws ParseException{
        System.out.println("Enter the End Date of the Project:");
        return simpleDateFormat.parse(scanner.nextLine());
    }

}
