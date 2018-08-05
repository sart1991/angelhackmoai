package com.moai.data.db.daos;

import com.moai.data.db.models.Property;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PropertyDao extends BaseDao {

    private static final String KEY_ID = "ID_PROPERTY";
    private static final String KEY_NAME_PROPERTY = "NAME_PROPERTY";
    private static final String KEY_VALUE = "VALUE";
    private static final String KEY_MEASURE_UNIT_ID_MUNIT = "MEASURE_UNIT_ID_MUNIT";
    private static final String KEY_RESOURCE_NEED_CAPACITY_ID_NEED_CAPACITY = "RESOURCE_NEED_CAPACITY_ID_NEED_CAPACITY";

    private static final String QUERY_BY_RESOURCE_ID = "SELECT * FROM PROPERTY WHERE RESOURCE_NEED_CAPACITY_ID_NEED_CAPACITY = %d";

    private static PropertyDao instance;

    private PropertyDao() {

    }

    public static PropertyDao get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized PropertyDao getSync() {
        if (instance == null) instance = new PropertyDao();
        return instance;
    }

    public List<Property> getProperties(long idResource) throws SQLException {
        String query = String.format(QUERY_BY_RESOURCE_ID, idResource);
        return mapProperties(getResultsFromQuery(query));
    }

    private List<Property> mapProperties(ResultSet rs) throws SQLException {
        List<Property> properties = new ArrayList<>();
        while (rs.next()) {
            Property prop = new Property();
            prop.setIdProperty(rs.getLong(KEY_ID));
            prop.setNameProperty(rs.getString(KEY_NAME_PROPERTY));
            prop.setValue(rs.getDouble(KEY_VALUE));
            prop.setMeasureUnitIdMunit(rs.getLong(KEY_MEASURE_UNIT_ID_MUNIT));
            prop.setResourceNeedCapacityIdNeedCapacity(rs.getLong(KEY_RESOURCE_NEED_CAPACITY_ID_NEED_CAPACITY));
            properties.add(prop);
        }
        return properties;
    }

}
