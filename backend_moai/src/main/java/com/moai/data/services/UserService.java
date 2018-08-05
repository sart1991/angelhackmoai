package com.moai.data.services;

import com.moai.data.db.daos.UserDao;
import com.moai.data.db.models.User;

import java.sql.SQLException;

public class UserService {

    private static UserService instance;
    private UserDao userDao;

    private UserService() {
        userDao = UserDao.get();
    }

    public static UserService get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized UserService getSync() {
        if (instance == null) instance = new UserService();
        return instance;
    }

    public User getUser(long id) throws SQLException {
        return userDao.getUser(id);
    }


}
