package com.moai.data.services;

import com.moai.data.db.daos.*;
import com.moai.data.db.models.CategoryProject;
import com.moai.data.db.models.Location;
import com.moai.data.db.models.Project;

import java.sql.SQLException;
import java.util.List;

public class ProjectService {

    private static ProjectService instance;

    private ProjectService() {

    }

    public static ProjectService get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized ProjectService getSync() {
        if (instance == null) instance = new ProjectService();
        return instance;
    }

    public Project getProjectById(long id) throws SQLException {
        Project project = ProjectDao.get().getProject(id);
        project.setCategoryProject(CategoryProjectDao.get().getCategoryProject(project.getCategoryProjectIdCat()));
        project.setLocation(LocationDao.get().getLocation(project.getLocationCodLocation(), project.getLocationTypeLocation()));
        project.setDateProjects(DateProjectDao.get().getDatesProject(project.getIdProject()));
        project.setResourceNeedCapacities(ResourceNeedCapacityDao.get().getResourcesList(project.getIdProject()));
        project.setRisks(RiskDao.get().getRisks(project.getIdProject()));
        return project;
    }


}
