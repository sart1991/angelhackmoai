package com.moai.data.db.daos;

import com.moai.data.db.models.CategoryProject;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryProjectDao extends BaseDao {

    private static final String KEY_ID = "ID_CAT";
    private static final String KEY_NAME_CATEGORY = "NAME_CATEGORY";

    private static final String QUERY_CATEGORY_PROJECT = "SELECT * FROM CATEGORY_PROJECT WHERE ID_CAT = %d";


    private static CategoryProjectDao instance;

    private CategoryProjectDao() {

    }

    public static CategoryProjectDao get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized CategoryProjectDao getSync() {
        if (instance == null) instance = new CategoryProjectDao();
        return instance;
    }

    public CategoryProject getCategoryProject(long id) throws SQLException {
        String query = String.format(QUERY_CATEGORY_PROJECT, id);
        return mapCategoryProject(getResultsFromQuery(query));
    }

    private CategoryProject mapCategoryProject(ResultSet rs) throws SQLException {
        CategoryProject cp = new CategoryProject();
        if (rs.first()) {

        }
        return cp;
    }

}
