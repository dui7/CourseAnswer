package com.hrbhuade.studentManageService;

import java.util.List;

import com.hrbhuade.pojo.Student;
import com.hrbhuade.studentManageDao.StudentDao;


public class StudentService {

	StudentDao student;
	
	public List<Student> FindStudent(String user){
		return student.FindStudent(user);
	}
	
	public List<Student> queryall(){
		return student.queryall();
	}
	
	public void AddStudent(Student d) {
		student.AddStudent(d);
	}
	public void UpdateStudent(Student d){
		student.UpdateStudent(d);
	}
	
	public void DeleteStudent(Student d){
		student.DeleteStudent(d);
	}
	
	public StudentDao getStudent() {
		return student;
	}
	public void setStudent(StudentDao student) {
		this.student = student;
	}
	
}
