package com.automate.service;

import com.automate.model.Project;
import com.automate.repository.ProjectRepository;

import java.util.List;

public class ProjectService {

    private ProjectRepository projectRepository=new ProjectRepository();
    private int uniqueIdentifier;
    public static void createProject(String nameOfProject, Date startDate, Date endDate){

        Project project = new Project(nameOfProject,startDate,endDate,ProjectIdGenerator.ProjectId());
        ProjectRepository.save(project);
        project.displayInformation();

    }

    public List<Project> listProject(){
        List<Project> project=projectRepository.fetchAll();
        return project;
    }
}
