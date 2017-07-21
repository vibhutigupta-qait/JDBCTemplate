package Training.project.joinee.mysqlproject;

import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JDBCTemplate {
	public static final String DriverclassName ="com.mysql.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/employees";
	public static final String username = "root";
	public static final String password = "qainfotech";
	public static DataSource datasource;

	
	
	
	public static  DriverManagerDataSource getDataSource(){
	
		DriverManagerDataSource datasource = new DriverManagerDataSource(); 
		datasource.setDriverClassName(DriverclassName);;
		datasource.setUrl(url);
		datasource.setUsername(username);
		datasource.setPassword(password);

		return (DriverManagerDataSource) datasource;
	}

	public static void main(String[] args) {

		datasource = getDataSource();
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
			jdbcTemplate.setDataSource(datasource);
			System.out.println("cREATING CONNECTION");
			//jdbcTemplate.execute("INSERT INTO empinfo (id,firstname,lastname,company) VALUES (6, 'riya', 'ramani','def')");
			//jdbcTemplate.execute("update empinfo set firstname='riya',lastname='ramani' where id = 6");
			//jdbcTemplate.execute("delete from empinfo where id=6");
			//jdbcTemplate.execute("select * from empinfo where id<=4");
			
			//List l = jdbcTemplate.queryForList("select * from empinfo order by id desc");
			List l = jdbcTemplate.queryForList("select id,firstname from empinfo order by id desc");
			Iterator it = l.iterator();
			while(it.hasNext())
			{
				Object o = it.next();
				System.out.println(o.toString());
			}
			
			
		

	}

}

