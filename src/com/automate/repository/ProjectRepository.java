package com.automate.repository;

import com.automate.model.Employee;
import com.automate.model.Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
public class ProjectRepository {
    private static Map<Integer,Project> projectData=new HashMap<>();

    public static void save(Project project){
        projectData.put(project.getUniqueIdentifier(), project);
    }
    public List<Project> fetchAll(){
        return new ArrayList<>(projectData.values());
}
}