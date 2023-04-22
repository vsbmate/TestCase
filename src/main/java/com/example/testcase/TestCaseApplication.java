package com.example.testcase;

import com.example.testcase.Actions.AddTestDataForDataBase;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Connection;
import java.sql.DriverManager;


@SpringBootApplication
@EnableJpaRepositories

public class TestCaseApplication {
    static DatabaseConnectionsTest databaseConnectionsTest;
    static AddTestDataForDataBase addTestDataForDataBase;


    public static void main(String[] args) throws JsonProcessingException {SpringApplication.run(TestCaseApplication.class, args);
        Connection con = null;

        try {
            //Registering the HSQLDB JDBC driver
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            //Creating the connection with HSQLDB
            con = DriverManager.getConnection("jdbc:hsqldb:file:D:/hsqldb-2.7.1/hsqldb/hsqldb/testCaseAutoCreatedDataBase", "SA", "");
            if (con!= null){
                System.out.println("Connection created successfully");

            }else{
                System.out.println("Problem with creating connection");
            }

        }  catch (Exception e) {
            e.printStackTrace(System.out);
        }

        databaseConnectionsTest.testDbConnection();


    }
}

