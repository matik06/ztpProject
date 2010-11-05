package db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Db {

	private static Db db = null;
	private java.sql.Connection connect = null;
	
	private final String dataBasename = "komis";
	private final String userName = "root";
	private final String password = "abc";
	
	private Db() {
		
		this.open();
	}
	
	private void open()
	{
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			
			connect = DriverManager
			.getConnection("jdbc:mysql://localhost/" 
					+ dataBasename 
					+ "?characterEncoding=latin2&"
					+ "user=" + userName 
					+"&password=" + password);			
				
		} catch (ClassNotFoundException e) {
			
			System.out.println(e);
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}
	

	public static Db getInstance()
	{
		if (db == null) {
			return new Db();
		}
		else {
			return db;
		}
	}
	
	public void close() {
		try {

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}
	
	public ResultSet executeQuery(String sql) throws SQLException
	{
		return connect.prepareStatement(sql).executeQuery();
	}
	
	public void executeUpdate(String sql) throws SQLException
	{
		connect.prepareStatement(sql).executeUpdate();
	}
}
