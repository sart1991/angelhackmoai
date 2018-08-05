package com.moai.data.db.daos;

import com.moai.data.db.models.Risk;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RiskDao extends BaseDao {

    private static final String KEY_ID = "ID_RISK";
    private static final String KEY_NAME_RISK = "NAME_RISK";
    private static final String KEY_DESCRIPTION_RISK = "DESCRIPTION_RISK";
    private static final String KEY_PROJECT_ID_PROJECT = "PROJECT_ID_PROJECT";

    private static final String QUERY_BY_PROJECT_ID = "SELECT * FROM RISK WHERE PROJECT_ID_PROJECT = %d";

    private static RiskDao instance;

    private RiskDao() {

    }

    public static RiskDao get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized RiskDao getSync() {
        if (instance == null) instance = new RiskDao();
        return instance;
    }

    public List<Risk> getRisks(long idProject) throws SQLException {
        String query = String.format(QUERY_BY_PROJECT_ID, idProject);
        return mapRisks(getResultsFromQuery(query));
    }

    private List<Risk> mapRisks(ResultSet rs) throws SQLException {
        List<Risk> risks = new ArrayList<>();
        while (rs.next()) {
            Risk risk = new Risk();
            risk.setIdRisk(rs.getLong(KEY_ID));
            risk.setNameRisk(rs.getString(KEY_NAME_RISK));
            risk.setDescriptionRisk(rs.getString(KEY_DESCRIPTION_RISK));
            risk.setProjectIdProject(rs.getLong(KEY_PROJECT_ID_PROJECT));
            risks.add(risk);
        }
        return risks;
    }

}
