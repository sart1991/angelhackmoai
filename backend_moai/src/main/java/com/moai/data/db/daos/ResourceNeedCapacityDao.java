package com.moai.data.db.daos;

import com.moai.data.db.models.ResourceNeedCapacity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResourceNeedCapacityDao extends BaseDao {

    private static final String KEY_ID = "ID_NEED_CAPACITY";
    private static final String KEY_RESOURCE_ID_RESOURCE = "RESOURCE_ID_RESOURCE";
    private static final String KEY_PROJECT_ID_PROJECT = "PROJECT_ID_PROJECT";

    private static final String QUERY_BY_ID = "SELECT * FROM RESOURCE_NEED_CAPACITY WHERE ID_NEED_CAPACITY = %d";
    private static final String QUERY_BY_PROJECT_ID = "SELECT * FROM RESOURCE_NEED_CAPACITY WHERE PROJECT_ID_PROJECT = %d";

    private static ResourceNeedCapacityDao instance;

    private ResourceNeedCapacityDao() {

    }

    public static ResourceNeedCapacityDao get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized ResourceNeedCapacityDao getSync() {
        if (instance == null) instance = new ResourceNeedCapacityDao();
        return instance;
    }

    public ResourceNeedCapacity getResourceNeedCapacity(long id) throws SQLException {
        String query = String.format(QUERY_BY_ID, id);
        return mapResourceNeedCapacity(getResultsFromQuery(query));
    }

    public List<ResourceNeedCapacity> getResourcesList(long idProject) throws SQLException {
        String query = String.format(QUERY_BY_PROJECT_ID, idProject);
        return mapResourcesNeedCapacity(getResultsFromQuery(query));
    }

    private ResourceNeedCapacity mapResourceNeedCapacity(ResultSet rs) throws SQLException {
        ResourceNeedCapacity needCapacity = new ResourceNeedCapacity();

        if (rs.first()) {
            needCapacity.setIdNeedCapacity(rs.getLong(KEY_ID));
            needCapacity.setResourceIdResource(rs.getLong(KEY_RESOURCE_ID_RESOURCE));
            needCapacity.setIdNeedCapacity(rs.getLong(KEY_PROJECT_ID_PROJECT));
        }

        return needCapacity;
    }

    private List<ResourceNeedCapacity> mapResourcesNeedCapacity(ResultSet rs) throws SQLException {

        List<ResourceNeedCapacity> resources = new ArrayList<>();

        while (rs.next()) {

            ResourceNeedCapacity needCapacity = new ResourceNeedCapacity();

            needCapacity.setIdNeedCapacity(rs.getLong(KEY_ID));
            needCapacity.setResourceIdResource(rs.getLong(KEY_RESOURCE_ID_RESOURCE));
            needCapacity.setProjectIdProject(rs.getLong(KEY_PROJECT_ID_PROJECT));

            resources.add(needCapacity);
        }


        return resources;
    }

}
