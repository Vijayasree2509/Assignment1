package com.automate.Controller;
import com.automate.model.Date;
import com.automate.model.Employee;
import com.automate.model.Project;
import com.automate.service.ProjectService;

import java.util.List;

public final class ProjectController {
    private ProjectService projectService = new ProjectService();

    public void createProject(final String nameOfProject, final Date startDate, final Date endDate) {
        if (validationIsSuccess(nameOfProject, startDate, endDate)) {
            ProjectService.createProject(nameOfProject, startDate, endDate);
        }

    }

    public List<Project> listProject() {
        return projectService.listProject();
    }
        private boolean validationIsSuccess (String nameOfProject, String startDate, String endDate){
            boolean validationIsSuccess = true;
            if (nameOfProject == null) {
                System.out.println("Enter Valid Project Name");
                validationIsSuccess = false;
            }
            return validationIsSuccess;
        }
    }

