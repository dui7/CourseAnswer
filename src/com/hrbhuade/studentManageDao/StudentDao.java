package com.hrbhuade.studentManageDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hrbhuade.pojo.Student;




public class StudentDao {
	SessionFactory sf;
	
public List<Student> FindStudent(String d) {
		
		Session sess = sf.openSession();	
		//System.out.println(d.getStudentUser());
		Query y = sess.createQuery("from Student where studentUser LIKE :studentUser");
		y.setString("studentUser", "%"+d+"%");

		
		//y.setEntity("studentUser", d);
		List<Student> list2 =y.list();
		List jsonArray = new ArrayList();
		for(Student student:list2){
			Map<String ,Object> jsonMap = new HashMap<String,Object>();
			
			jsonMap.put("user", student.getStudentUser());
			jsonMap.put("password", student.getStudentPassword());
			jsonMap.put("name",student.getStudentName());
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
	public List<Student> queryall() {
		
		Session sess = sf.openSession();	
		Query y = sess.createQuery("from Student");
		List<Student> list2 =y.list();
		List jsonArray = new ArrayList();
		for(Student student:list2){
			Map<String ,Object> jsonMap = new HashMap<String,Object>();
			jsonMap.put("user", student.getStudentUser());
			jsonMap.put("password", student.getStudentPassword());
			jsonMap.put("name",student.getStudentName());
			jsonMap.put("AnswerContentNo",student.getAnswerContentNo());
			jsonMap.put("email",student.getStudentEmail());
			jsonMap.put("sex",student.getStudentSex());
			jsonMap.put("ico",student.getStudentIco());
			jsonArray.add(jsonMap);
		}
		return jsonArray;
		
	}
	public void AddStudent(Student d) {
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.save(d);
		tra.commit();
		sess.close();
	}

	public void UpdateStudent(Student d) {
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.update(d);
		tra.commit();
	}
	
	
	public void DeleteStudent(Student d) {
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.delete(d);
		tra.commit();
	}
	public SessionFactory getSf() {
		return sf;
	}


	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
}
