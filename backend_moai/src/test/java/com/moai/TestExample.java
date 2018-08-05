package com.moai;

import com.moai.data.db.AppDB;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestExample {

    @Test
    public void dbTest() {

//        Connection conn = AppDB.get().getConn();
//
//        try {
//            ResultSet rs = conn.prepareStatement("select * from location").executeQuery();
//            while (rs.next()) {
//                String code = rs.getString("COD_LOCATION");
//                System.out.println("code: " + code);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("dbTest: " + e.getMessage());
//        }

        //System.out.println("fuck");

    }

}
