package com.moai.data.services;

import com.moai.data.db.daos.CategoryProjectDao;
import com.moai.data.db.daos.ProjectDao;
import com.moai.data.db.models.CategoryProject;

import java.sql.SQLException;

public class CategoryService {

    private static CategoryService instance;

    private CategoryService() {

    }

    public static CategoryService get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized CategoryService getSync() {
        if (instance == null) instance = new CategoryService();
        return instance;
    }

    public CategoryProject getCategoryWithProjects(long idCategory) throws SQLException {
        CategoryProject cat = CategoryProjectDao.get().getCategoryProject(idCategory);
        cat.setProjects(ProjectDao.get().getProjectByCategory(idCategory));
        return cat;
    }

}
