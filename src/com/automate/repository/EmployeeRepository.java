package com.automate.repository;
import com.automate.model.Employee;

import java.util.*;

public class EmployeeRepository {
   private static Map<Integer,Employee> employeeData=new HashMap<>();
  // private static List<Employee> employeesData = new ArrayList<>();


    public static void save(Employee employee) {
        employeeData.put(employee.getUniqueIdentifier(), employee);
    }
    public Employee retrieve(final int key){
       return employeeData.get(key);
    }
    public boolean delete(int employeeId){
        if(employeeData.containsKey(employeeId)){
            employeeData.remove(employeeId);
            return true;
        }
        return false;
    }
    public List<Employee> fetchAll(){
        return new ArrayList<>(employeeData.values());
    }
}
