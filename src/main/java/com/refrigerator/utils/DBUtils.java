package com.refrigerator.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
 	private static final String DB_URL = "jdbc:mysql://localhost:3306/"; // mysql server url
 	private static final String DATABASE_NAME = "orders"; // database schema name
 	private static final String USER = "root";
 	private static final String  PASSWORD = "1234";

 	public static Connection getConnection() throws SQLException{
 		Connection connection = DriverManager.getConnection(DB_URL + DATABASE_NAME, USER, PASSWORD);
 		return connection;

 	}

}
