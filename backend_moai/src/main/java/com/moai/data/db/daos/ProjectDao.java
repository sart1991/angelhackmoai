package com.moai.data.db.daos;

import com.moai.data.db.models.Project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjectDao extends BaseDao {

    private static final String KEY_ID = "ID_PROJECT";
    private static final String KEY_NAME_PROJECT = "NAME_PROJECT";
    private static final String KEY_CATEGORY_PROJECT_ID_CAT = "CATEGORY_PROJECT_ID_CAT";
    private static final String KEY_LOCATION_COD_LOCATION = "LOCATION_COD_LOCATION";
    private static final String KEY_LOCATION_TYPE_LOCATION = "LOCATION_TYPE_LOCATION";
    private static final String KEY_DESCRIPTION_PROJECT = "DESCRIPTION_PROJECT";
    private static final String KEY_OBJECTIVE = "OBJECTIVE";
    private static final String KEY_SCOPE = "SCOPE";

    private static final String QUERY_ALL_PROJECTS = "SELECT * FROM PROJECT";
    private static final String QUERY_BY_ID = "SELECT * FROM PROJECT WHERE ID_PROJECT = %d";
    private static final String QUERY_BY_CATEGORY_ID = "SELECT * FROM PROJECT WHERE CATEGORY_PROJECT_ID_CAT = %d";
    private static final String QUERY_PROJECTS_FROM_USER = "";

    private static ProjectDao instance;

    private ProjectDao() {

    }

    public static ProjectDao get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized ProjectDao getSync() {
        if (instance == null) instance = new ProjectDao();
        return instance;
    }

    public Project getProject(long id) throws SQLException {
        String query = String.format(QUERY_BY_ID, id);
        return mapProject(getResultsFromQuery(query));
    }

    public List<Project> getProjectByCategory(long idCategory) throws SQLException {
        String query = String.format(QUERY_BY_CATEGORY_ID, idCategory);
        return mapProjects(getResultsFromQuery(query));
    }

    private Project mapProject(ResultSet rs) throws SQLException {
        Project p = new Project();

        if (rs.first()) {
            p.setIdProject(rs.getLong(KEY_ID));
            p.setNameProject(rs.getString(KEY_NAME_PROJECT));
            p.setCategoryProjectIdCat(rs.getLong(KEY_CATEGORY_PROJECT_ID_CAT));
            p.setLocationCodLocation(rs.getString(KEY_LOCATION_COD_LOCATION));
            p.setLocationTypeLocation(rs.getString(KEY_LOCATION_TYPE_LOCATION));
            p.setDescriptionProject(rs.getString(KEY_DESCRIPTION_PROJECT));
            p.setObjective(rs.getString(KEY_OBJECTIVE));
            p.setScope(rs.getString(KEY_SCOPE));
        }

        return p;
    }

    private List<Project> mapProjects(ResultSet rs) throws SQLException {
        List<Project> projects = new ArrayList<>();
        while (rs.next()) {
            Project p = new Project();
            p.setIdProject(rs.getLong(KEY_ID));
            p.setNameProject(rs.getString(KEY_NAME_PROJECT));
            p.setCategoryProjectIdCat(rs.getLong(KEY_CATEGORY_PROJECT_ID_CAT));
            p.setLocationCodLocation(rs.getString(KEY_LOCATION_COD_LOCATION));
            p.setLocationTypeLocation(rs.getString(KEY_LOCATION_TYPE_LOCATION));
            p.setDescriptionProject(rs.getString(KEY_DESCRIPTION_PROJECT));
            p.setObjective(rs.getString(KEY_OBJECTIVE));
            p.setScope(rs.getString(KEY_SCOPE));
            projects.add(p);
        }

        return projects;
    }

}
