package com.hrbhuade.teacherManageDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hrbhuade.pojo.Student;
import com.hrbhuade.pojo.Teacher;

public class TeacherDao {

	SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	
public List<Teacher> FindTeacher(String d) {
		
		Session sess = sf.openSession();	
		
		Query y = sess.createQuery("from Teacher where teacherUser LIKE :teacherUser");
		y.setString("teacherUser", "%"+d+"%");

		List<Teacher> list2 =y.list();
		List jsonArray = new ArrayList();
		for(Teacher teacher:list2){
			Map<String ,Object> jsonMap = new HashMap<String,Object>();
			
			jsonMap.put("user", teacher.getTeacherUser());
			jsonMap.put("password", teacher.getTeacherPassword());
			jsonMap.put("name", teacher.getTeacherName());
			//jsonMap.put("AnswerContentNo",student.getAnswerContentNo());
			//jsonMap.put("email",student.getStudentEmail());
		//	jsonMap.put("sex",student.getStudentSex());
		//	jsonMap.put("ico",student.getStudentIco());
		//	System.out.println(student.getStudentUser());
		//	System.out.println(student.getStudentName());
			jsonArray.add(jsonMap);
		}
		
		sess.close();
		return jsonArray;
		
		
	
	}
	
	public List<Teacher> queryall() {

		Session sess = sf.openSession();
		Query y = sess.createQuery("from Teacher");
		List<Teacher> list2 = y.list();
		List jsonArray = new ArrayList();
		for (Teacher teacher : list2) {
			Map<String, Object> jsonMap = new HashMap<String, Object>();
			jsonMap.put("user", teacher.getTeacherUser());
			jsonMap.put("password", teacher.getTeacherPassword());
			jsonMap.put("name", teacher.getTeacherName());
		//	System.out.println(""+teacher.getTeacherName());
			jsonArray.add(jsonMap);
		}
		sess.close();
		return jsonArray;

	}
	
	
	public void AddTeacher(Teacher d) {
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.save(d);
		tra.commit();
		sess.close();
	}

	public void UpdateTeacher(Teacher d) {
		
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.update(d);
		tra.commit();
		sess.close();
	}
	
	
	public void DeleteTeacher(Teacher d) {
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.delete(d);
		tra.commit();
		sess.close();
	}
	
	
}
