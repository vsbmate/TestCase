package com.example.testcase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionsTest {

    public static void testDbConnection(){
        Connection conn = null;
        try {
            // Загружаем драйвер базы данных
            Class.forName("org.hsqldb.jdbc.JDBCDriver");

            // Создаем соединение с базой данных
            conn = DriverManager.getConnection("jdbc:hsqldb:file:D:/hsqldb-2.7.1/hsqldb/hsqldb/testCaseAutoCreatedDataBase", "sa", "");

            // Если соединение установлено успешно
            System.out.println("Connection established to HSQLDB database.");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (
                SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
