package DatabaseDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException {
		
		String host="localhost";
		String port= "3306";

		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "Mysql@1328");

		Statement s=con.createStatement();

		ResultSet rs=s.executeQuery("select * from employeinfo");

		while(rs.next())

		{

		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("id"));
		System.out.println(rs.getString("location"));
		System.out.println(rs.getString("age"));
		
		
		}

	}

}
