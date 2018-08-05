package com.moai.data.db.daos;

import com.moai.data.db.models.Resource;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResourceDao extends BaseDao {

    private static ResourceDao instance;

    private static final String KEY_ID = "ID_RESOURCE";
    private static final String KEY_NAME = "NAME_RESOURCE";

    private static final String QUERY_RESOURCE = "SELECT * FROM RESOURCE WHERE ID_RESOURCE = %d";


    private ResourceDao() {

    }

    public static ResourceDao get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized ResourceDao getSync() {
        if (instance == null) instance = new ResourceDao();
        return instance;
    }

    public Resource getResource(long id) throws SQLException {
        String query = String.format(QUERY_RESOURCE, id);
        return mapResource(getResultsFromQuery(query));
    }

    private Resource mapResource(ResultSet rs) throws SQLException {

        Resource r = new Resource();

        if (rs.first()) {
            r.setIdResource(rs.getLong(KEY_ID));
            r.setNameResource(rs.getString(KEY_NAME));
        }

        return r;
    }

}
