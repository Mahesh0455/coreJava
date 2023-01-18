package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P1 {
		
		public static void main(String[] args){
			Connection con;
			
			try {
				
				
				con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental",
			            "postgres", "root");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from actor");
				 while(rs.next()) {
						
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
						
					}
					
				
			}catch(Exception e) {
				e.printStackTrace();	
			}
			
			
			
			
			
			
			
			
			
		}

}
