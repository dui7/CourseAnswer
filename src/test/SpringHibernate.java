package test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hrbhuade.adminUserDao.AuthDao;

public class SpringHibernate {	
	
	
	
	private ApplicationContext app = null;
	{
		app=new ClassPathXmlApplicationContext("applicationContext.xml");
		}
	@Test
	public void datasourse() throws SQLException {
		DataSource data = (DataSource) app.getBean(DataSource.class);
		System.out.println(data.getConnection());
	}
	


	@Test
	public void getAdminUserRoleId(){
	//	SessionFactory sessionFactory = (SessionFactory) app.getBean("roleDao");

	}

}
