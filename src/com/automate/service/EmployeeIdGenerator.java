package com.automate.service;

public class EmployeeIdGenerator {
    private static int Id=1;
    public static int EmployeeId(){
        return Id++;
    }
}
