package com.automate.model;

public class Project {
    private String nameOfProject;
    private Date startDate;
    private Date endDate;
    private int uniqueIdentifier;

    public Project(String nameOfProject, Date startDate, Date endDate,int uniqueIdentifier) {
        this.nameOfProject = nameOfProject;
        this.startDate = startDate;
        this.endDate = endDate;
        this.uniqueIdentifier=uniqueIdentifier;
    }

    public void displayInformation() {
        System.out.println(this.nameOfProject + "," + this.startDate + "," + this.endDate + "," + this.uniqueIdentifier);

    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public String toString() {
        return "nameOfProject " + nameOfProject + "  startDate " + startDate + "  endDate " + endDate;
    }
}