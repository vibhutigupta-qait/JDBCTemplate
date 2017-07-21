package Training.project.joinee.mysqlproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class Datasource {
	
	public static DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
	Datasource.dataSource = dataSource;
	
	}
	
	public static void main(String[] args) {
		
	

		  ApplicationContext context = 
		    		new ClassPathXmlApplicationContext("Spring-Datasource.xml");
		 /* Employee employee = new Employee(1,"vanika","singhal","linchpin");
		  
			  
			  

					String sql = "INSERT INTO Employee " +
						"(id, firstname, lastname,company) VALUES (?, ?, ?)";

					JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

					jdbcTemplate.update(sql, new Object[] { employee.getid(),
						employee.getfirstname(),employee.getlastname(),employee.getcompany()});*/
		
		  
		
		// TODO Auto-generated method stub{
		String sql = "INSERT INTO empinfo " +
				"(id, firstname, secondname,company) VALUES (?,?,?,?)";
		Connection conn = null;
		
		

		try {
			conn = ((Statement) context).getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 6);
			ps.setString(2, "vanika");
			ps.setString(3, "singhal");
			ps.setString(4, "linchpintechnology");
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	private static void DriverManager() {
		// TODO Auto-generated method stub
		
	}
	
}


