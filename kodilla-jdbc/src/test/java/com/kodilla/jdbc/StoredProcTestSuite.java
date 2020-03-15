package com.kodilla.jdbc;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeQuery(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT CCOUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        Assertions.assertEquals(0, howMany);
    }


    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET IS_BESTSELLER=null ";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeQuery(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateBestseller()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT CCOUNT(*) AS HOW_MANY FROM BOOK WHERE IS_BESTSELLER=null";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        Assertions.assertEquals(0, howMany);
    }
}