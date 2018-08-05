package com.moai.data.db.daos;

import com.moai.data.db.models.Location;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationDao extends BaseDao {

    private static final String KEY_COD_LOCATION = "COD_LOCATION";
    private static final String KEY_TYPE_LOCATION = "TYPE_LOCATION";
    private static final String KEY_NAME_LOCATION = "NAME_LOCATION";
    private static final String KEY_LOCATION_COD_LOCATION = "LOCATION_COD_LOCATION";
    private static final String KEY_LOCATION_TYPE_LOCATION = "LOCATION_TYPE_LOCATION";

    private static final String QUERY_BY_CODE_TYPE = "SELECT * FROM LOCATION WHERE COD_LOCATION = '%s' AND TYPE_LOCATION = '%s'";

    private static LocationDao instance;

    private LocationDao() {

    }

    public static LocationDao get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized LocationDao getSync() {
        if (instance == null) instance = new LocationDao();
        return instance;
    }

    public Location getLocation(String code, String type) throws SQLException {
        String query = String.format(QUERY_BY_CODE_TYPE, code, type);
        return mapLocation(getResultsFromQuery(query));
    }

    private Location mapLocation(ResultSet rs) throws SQLException {
        Location loc = new Location();

        if (rs.first()) {
            loc.setCodLocation(rs.getString(KEY_COD_LOCATION));
            loc.setTypeLocation(rs.getString(KEY_TYPE_LOCATION));
            loc.setNameLocation(rs.getString(KEY_NAME_LOCATION));
            loc.setLocationCodLocation(rs.getString(KEY_LOCATION_COD_LOCATION));
            loc.setLocationTypeLocation(rs.getString(KEY_LOCATION_TYPE_LOCATION));
        }

        return loc;
    }

}
