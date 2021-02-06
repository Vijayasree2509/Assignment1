package com.automate.service;

public class ProjectIdGenerator {
    private static int Id = 1;

    public static int ProjectId() {
        return Id++;
    }
}