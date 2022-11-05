package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabasePage {
	Connection connection;
	 java.sql.Statement statement;
	 ResultSet resultSet;
	 String columnValue;
	 
	 public String getDataFromDb(String columnName) {  
	//  set properties for mySQL 
	  try {   
	  Class.forName("com.mysql.cj.jdbc.Driver");   
	  
	  String sqlUsername= "root";
	  String sqlPassword = "admin";
	  String sqlUrl = "jdbc:mysql://localhost:3306/april2022";
	  String sqlQurey = "Select * from users;" ;
	  
	//  Create connection to the local database  
	  connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);  
	  
	//  Empowering connection reference variable to execute queries   
	  statement = connection.createStatement(); 
	  
	//  Delivering query  
	  resultSet = statement.executeQuery(sqlQurey);
	   
	   while (resultSet.next()) {
	    columnValue = resultSet.getString(columnName);
	    return columnValue;
	   }
	  } catch (Exception e) {
	   e.printStackTrace();
	  } 

	  return columnValue;
	 }

	}