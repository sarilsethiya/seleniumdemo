package com.mwp.abbmi.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection extends ReadConfigFile {
	Connection con;

	
	
	public JDBCConnection() {

		try {
			Class.forName(getObject("DATABASE_DRIVER"));
			System.out.println("driver loaded successfully");

		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to load the driver");
		}

	}

	public Connection setConnection() {

		try {

			con = DriverManager.getConnection(getObject("DATABASE_URL"), getObject("USERNAME"), getObject("PASSWORD"));

			System.out.println("database connection Success");
			return con;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occured in connection");
			return null;
		}

	}

}