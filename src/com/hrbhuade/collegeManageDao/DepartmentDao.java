package com.hrbhuade.collegeManageDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hrbhuade.pojo.Courses;
import com.hrbhuade.pojo.Department;

public class DepartmentDao {

	SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public List<Department> FindCourse(String d) {

		Session sess = sf.openSession();

		Query y = sess
				.createQuery("from Department where departmentName LIKE :departmentName");
		y.setString("departmentName", "%" + d + "%");

		List<Department> list2 = y.list();
		List jsonArray = new ArrayList();
		for (Department department : list2) {
			Map<String, Object> jsonMap = new HashMap<String, Object>();

			jsonMap.put("user", department.getDepartmentNo());
			jsonMap.put("name", department.getDepartmentName());
			// jsonMap.put("name", courses.getTeachersoffice());

			jsonArray.add(jsonMap);
		}

		sess.close();
		return jsonArray;

	}

	public List<Department> queryall() {

		Session sess = sf.openSession();
		Query y = sess.createQuery("from Department");
		List<Department> list2 = y.list();
		List jsonArray = new ArrayList();
		for (Department department : list2) {
			Map<String, Object> jsonMap = new HashMap<String, Object>();
			jsonMap.put("user", department.getDepartmentNo());
			jsonMap.put("name", department.getDepartmentName());
			// jsonMap.put("name", courses.getTeachersoffice());
			// System.out.println(""+teacher.getTeacherName());
			jsonArray.add(jsonMap);
		}
		sess.close();
		return jsonArray;

	}

	
/*
	public List<Department> queryname() {

		Session sess = sf.openSession();
		Query y = sess.createQuery("from Department");
		List<Department> list2 = y.list();
		List jsonArray = new ArrayList();
		for (Department department : list2) {
			Map<String, Object> jsonMap = new HashMap<String, Object>();
			//jsonMap.put("user", department.getDepartmentNo());
			jsonMap.put("name", department.getDepartmentName());
			// jsonMap.put("name", courses.getTeachersoffice());
			// System.out.println(""+teacher.getTeacherName());
			jsonArray.add(jsonMap);
		}
		sess.close();
		return jsonArray;

	}*/
	
	public void AddDepartment(Department d) {
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.save(d);
		tra.commit();
		sess.close();
	}

	public void DeleteDepartment(Department d) {
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.delete(d);
		tra.commit();
		sess.close();
	}
public void UpdateDepartment(Department d) {
		
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.update(d);
		tra.commit();
		sess.close();
	}
}
