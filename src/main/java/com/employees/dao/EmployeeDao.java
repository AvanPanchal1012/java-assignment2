package com.employees.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.employees.model.Employee;

public class EmployeeDao {
	
	 private static final String INSERT_USERS_SQL = "INSERT INTO User" + "  (UserName, Password, Email, Contact, City) VALUES " + " (?, ?, ?, ?, ?);";
	 private static final String SELECT_USER_BY_USERNAME_AND_PASSWORD = "SELECT UserName FROM User WHERE UserName =? and Password =?";
	 
	public Connection setConnection() {
		Connection con = null;
		
		String user = "root";
		String pass = "1012";
		
		String url = "jdbc:mysql://localhost:3306/users?autoReconnect=true&useSSL=false";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,pass);
			
			System.out.println("Conncetion Successfull !!!");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public void saveUser(Employee em) throws Exception {
        try (Connection connection = setConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, em.getUserName());
            preparedStatement.setString(2, em.getPassword());
            preparedStatement.setString(3, em.getEmail());
            preparedStatement.setString(4, em.getContact());
            preparedStatement.setString(5, em.getCity());
            preparedStatement.executeUpdate();
        }
    }

    public boolean validateUser(String userName, String password) throws Exception {
        boolean status = false;
        try (Connection connection = setConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_USERNAME_AND_PASSWORD)) {
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();
        }
        return status;
    }

}
