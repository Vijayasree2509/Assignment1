package com.automate.Controller;
import com.automate.model.Project;
import com.automate.service.ProjectService;

public final class projectController {
   private ProjectService projectService=new ProjectService();

    public int createProject(final String nameOfProject,final String startDate,final String endDate){
        if(validationIsSuccess(nameOfProject,startDate,endDate)){
            return ProjectService.createProject(nameOfProject,startDate,endDate);
        }
        return -1;
    }
    private boolean validationIsSuccess(String nameOfProject,String startDate,String endDate) {
        boolean validationIsSuccess = true;
        if (nameOfProject == null){
            System.out.println("Enter Valid Project Name");
            validationIsSuccess=false;
        }
        return validationIsSuccess;
    }
}
