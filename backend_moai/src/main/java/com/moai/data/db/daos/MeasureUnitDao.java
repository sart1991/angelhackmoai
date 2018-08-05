package com.moai.data.db.daos;

import com.moai.data.db.models.MeasureUnit;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MeasureUnitDao extends BaseDao {

    private static final String KEY_ID = "ID_MUNIT";
    private static final String KEY_NAME_MUNIT = "NAME_MUNIT";

    private static final String QUERY_BY_ID = "SELECT * FROM MEASURE_UNIT WHERE ID_MUNIT = %d";

    private static MeasureUnitDao instance;

    private MeasureUnitDao() {

    }

    public static MeasureUnitDao get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized MeasureUnitDao getSync() {
        if (instance == null) instance = new MeasureUnitDao();
        return instance;
    }

    public MeasureUnit getMeasureUnit(long id) throws SQLException {
        String query = String.format(QUERY_BY_ID, id);
        return mapMesaureUnit(getResultsFromQuery(query));
    }

    private MeasureUnit mapMesaureUnit(ResultSet rs) throws SQLException {
        MeasureUnit mu = new MeasureUnit();
        if (rs.first()) {
            mu.setIdMunit(rs.getLong(KEY_ID));
            mu.setNameMunit(rs.getString(KEY_NAME_MUNIT));
        }
        return mu;
    }

}
