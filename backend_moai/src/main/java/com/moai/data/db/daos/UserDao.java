package com.moai.data.db.daos;

import com.moai.data.db.AppDB;
import com.moai.data.db.models.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao extends BaseDao {

    private static final String KEY_ID = "ID_USER";
    private static final String KEY_FIRST_NAME = "FIRST_NAME";
    private static final String KEY_LAST_NAME = "LAST_NAME";
    private static final String KEY_EMAIL = "EMAIL";

    private static final String QUERY_USER_BY_ID = "SELECT * FROM USER WHERE ID_USER = %d";

    private static UserDao instance;

    private UserDao() {}

    public static UserDao get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized UserDao getSync() {
        if (instance == null) instance = new UserDao();
        return instance;
    }

    public User getUser(long id) throws SQLException {

        String query = String.format(QUERY_USER_BY_ID, id);
        ResultSet rs = getResultsFromQuery(query);

        return mapUser(rs);
    }

    private User mapUser(ResultSet rs) throws SQLException {
        User user = new User();
        if (rs.first()) {
            user.setIdUser(rs.getLong(KEY_ID));
            user.setFirstName(rs.getString(KEY_FIRST_NAME));
            user.setLastName(rs.getString(KEY_LAST_NAME));
            user.setEmail(rs.getString(KEY_EMAIL));
        }
        return user;
    }

}
