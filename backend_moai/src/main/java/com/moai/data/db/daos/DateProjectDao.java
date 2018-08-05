package com.moai.data.db.daos;

import com.moai.data.db.models.DateProject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DateProjectDao extends BaseDao {

    private static final String KEY_ID = "ID_DATE";
    private static final String KEY_NAME_DATE = "NAME_DATE";
    private static final String KEY_VALUE_DATE = "VALUE_DATE";
    private static final String KEY_PROJECT_ID_PROJECT = "PROJECT_ID_PROJECT";

    private static final String QUERY_ALL_DATES_OF_PROJECT = "SELECT * FROM DATE_PROJECT WHERE PROJECT_ID_PROJECT = %d";

    private static DateProjectDao instance;

    private DateProjectDao() {

    }

    public static DateProjectDao get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized DateProjectDao getSync() {
        if (instance == null) instance = new DateProjectDao();
        return instance;
    }

    public List<DateProject> getDatesProject(long idProject) throws SQLException {
        String query = String.format(QUERY_ALL_DATES_OF_PROJECT, idProject);
        return mapDatesProject(getResultsFromQuery(query));
    }


    private DateProject mapDateProject(ResultSet rs) throws SQLException {
        DateProject dateProject = new DateProject();

        if (rs.first()) {
            dateProject.setIdDate(rs.getLong(KEY_ID));
            dateProject.setNameDate(rs.getString(KEY_NAME_DATE));
            dateProject.setValueDate(rs.getDate(KEY_VALUE_DATE));
            dateProject.setProjectIdProject(rs.getLong(KEY_PROJECT_ID_PROJECT));
        }

        return dateProject;
    }

    private List<DateProject> mapDatesProject(ResultSet rs) throws SQLException {
        List<DateProject> dates = new ArrayList<>();

        while (rs.next()) {
            DateProject dateProject = new DateProject();

            dateProject.setIdDate(rs.getLong(KEY_ID));
            dateProject.setNameDate(rs.getString(KEY_NAME_DATE));
            dateProject.setValueDate(rs.getDate(KEY_VALUE_DATE));
            dateProject.setProjectIdProject(rs.getLong(KEY_PROJECT_ID_PROJECT));

            dates.add(dateProject);
        }
        return dates;

    }

}
