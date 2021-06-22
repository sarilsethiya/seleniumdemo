package com.mwp.abbmi.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBResults {

	public static JDBCConnection dbcon = new JDBCConnection();
	public static Connection con = null;
	public static PreparedStatement ps = null;
	public static ResultSet resultSet = null;

	public static ResultSet getResultSet(String query) {

		try {
			con = dbcon.setConnection();
			ps = con.prepareStatement(query);
			resultSet = ps.executeQuery();

			System.out.println(resultSet = ps.executeQuery());

		}

		catch (Exception e) {
			System.out.println("Something went wrong in getResultSet()");
			e.printStackTrace();
		}
		return resultSet;

	}

}



