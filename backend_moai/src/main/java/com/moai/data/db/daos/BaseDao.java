package com.moai.data.db.daos;

import com.moai.data.db.AppDB;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class BaseDao {

    protected ResultSet getResultsFromQuery(String query) throws SQLException {
        return AppDB.get().getConn().prepareStatement(query).executeQuery();
    }

}
