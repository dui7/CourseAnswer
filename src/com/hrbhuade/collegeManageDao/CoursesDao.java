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
import com.hrbhuade.pojo.Teacher;

public class CoursesDao {
	
	
	SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	
public List<Courses> FindCourse(String d) {
		
		Session sess = sf.openSession();	
		
		Query y = sess.createQuery("from Courses where courseName LIKE :courseName");
		y.setString("courseName", "%"+d+"%");

		List<Courses> list2 =y.list();
		List jsonArray = new ArrayList();
		for(Courses courses:list2){
			Map<String ,Object> jsonMap = new HashMap<String,Object>();
			
			jsonMap.put("user", courses.getCourseId());
			jsonMap.put("name", courses.getCourseName());
		//	jsonMap.put("name", courses.getTeachersoffice());
			
			jsonArray.add(jsonMap);
		}
		
		sess.close();
		return jsonArray;
		
		
	
	}
	
	public List<Courses> queryall() {

		Session sess = sf.openSession();
		Query y = sess.createQuery("from Courses");
		List<Courses> list2 = y.list();
		List jsonArray = new ArrayList();
		for (Courses courses : list2) {
			Map<String, Object> jsonMap = new HashMap<String, Object>();
			jsonMap.put("user", courses.getCourseId());
			jsonMap.put("name", courses.getCourseName());
		//jsonMap.put("name", courses.getTeachersoffice());
		//	System.out.println(""+teacher.getTeacherName());
			jsonArray.add(jsonMap);
		}
		sess.close();
		return jsonArray;

	}

	public void AddCourses(Courses d) {
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.save(d);
		tra.commit();
		sess.close();
	}

public void UpdateCourses(Courses d) {
		
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.update(d);
		tra.commit();
		sess.close();
	}
	
public void DeleteCourses(Courses d) {
	Session sess = sf.openSession();
	Transaction tra = sess.beginTransaction();
	sess.delete(d);
	tra.commit();
	sess.close();
}

}
