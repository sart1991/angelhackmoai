package com.moai.data.db.daos;

import com.moai.data.db.models.Inversion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InversionDao extends BaseDao {

    private static final String KEY_ID = "ID_INVERSION";
    private static final String KEY_STATUS = "STATUS";
    private static final String KEY_USER_ID_USER = "USER_ID_USER";
    private static final String KEY_RESOURCE_NEED_CAPACITY_ID_NEED_CAPACITY = "RESOURCE_NEED_CAPACITY_ID_NEED_CAPACITY";

    private static final String QUERY_BY_USER_ID = "SELECT * FROM INVERSION WHERE USER_ID_USER = %d";
    private static final String QUERY_BY_RESOURCE_ID = "SELECT * FROM INVERSION WHERE RESOURCE_NEED_CAPACITY_ID_NEED_CAPACITY = %d";

    private static InversionDao instance;

    private InversionDao() {

    }

    public static InversionDao get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized InversionDao getSync() {
        if (instance == null) instance = new InversionDao();
        return instance;
    }

    public List<Inversion> getInversionsByUser(long idUser) throws SQLException {
        String query = String.format(QUERY_BY_USER_ID, idUser);
        return mapInversions(getResultsFromQuery(query));
    }

    public List<Inversion> getInversionsByResource(long idResource) throws SQLException {
        String query = String.format(QUERY_BY_RESOURCE_ID, idResource);
        return mapInversions(getResultsFromQuery(query));
    }



    private List<Inversion> mapInversions(ResultSet rs) throws SQLException {
        List<Inversion> inversions = new ArrayList<>();

        while (rs.next()) {

            Inversion i = new Inversion();
            i.setIdInversion(rs.getLong(KEY_ID));
            i.setStatus(rs.getLong(KEY_STATUS));
            i.setUserIdUser(rs.getLong(KEY_USER_ID_USER));
            i.setResourceNeedCapacityIdNeedCapacity(rs.getLong(KEY_RESOURCE_NEED_CAPACITY_ID_NEED_CAPACITY));
            inversions.add(i);
        }

        return inversions;
    }

}
