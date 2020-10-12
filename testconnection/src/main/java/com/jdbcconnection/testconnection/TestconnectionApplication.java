package com.jdbcconnection.testconnection;

import java.sql.Connection;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class TestconnectionApplication {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(TestconnectionApplication.class, args);
		
//		 Connection connection = null;
//	        Statement selectStmt = null;
//	        try
//	        {
//	            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/Shop", "postgres", "123_Stella");
//	                     
//	            selectStmt = connection.createStatement();
//	            ResultSet rs = selectStmt.executeQuery("SELECT CODART FROM ARTICOLI");
//	            while(rs.next())
//	            {
//	                System.out.println(rs.getString(1));    //First Column
//
//	            }
//	        } 
//	        catch (Exception e) {
//	            e.printStackTrace();
//	        }finally {
//	            try {
//	                selectStmt.close();
//	                connection.close();
//	            } catch (Exception e) {
//	                e.printStackTrace();
//	            }
//	        }
	}
	
	@Component
	class nuova {
		@PostConstruct
		public void prova () {
			int result = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM ARTICOLI", Integer.class);
			System.out.println("****** "+ result);
		}
		
	}


}
