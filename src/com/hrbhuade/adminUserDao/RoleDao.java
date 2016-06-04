package com.hrbhuade.adminUserDao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hrbhuade.pojo.AdminUser;
import com.hrbhuade.pojo.Role;

public class RoleDao {


private SessionFactory sessionFactory;
private AdminUser adminUser;

public String getAuthIdsById(String roleId){
	String hql="from Role where roleId="+roleId+"";//(authIds) where role.roleId=:roleId   where roleId=:role
	Session session = sessionFactory.openSession();
	Query query = session.createQuery(hql);
	List<Role> list =  query.list();
	
	return list.get(0).getAuthIds();
}
public SessionFactory getSessionFactory() {
	return sessionFactory;
}
public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}
public AdminUser getAdminUser() {
	return adminUser;
}
public void setAdminUser(AdminUser adminUser) {
	this.adminUser = adminUser;
}
}
