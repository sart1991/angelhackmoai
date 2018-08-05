package com.moai.data;

public class DataManager {

    private static DataManager instance;

    private DataManager() {}

    public static DataManager get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized DataManager getSync() {
        if (instance == null) instance = new DataManager();
        return instance;
    }

}
