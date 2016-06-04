package com.hrbhuade.teacherManageService;

import java.util.List;
import com.hrbhuade.pojo.Teacher;
import com.hrbhuade.teacherManageDao.TeacherDao;


public class TeacherService {
	TeacherDao teacher;
	
	public TeacherDao getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherDao teacher) {
		this.teacher = teacher;
	}
	
	
	public void AddTeacher(Teacher d) {
		teacher.AddTeacher(d);
	}
	
	public void UpdateTeacher(Teacher d){
		teacher.UpdateTeacher(d);
	}
	
	public void DeleteTeacher(Teacher d){
		teacher.DeleteTeacher(d);
	}
	
	public List<Teacher> FindTeacher(String user){
		return teacher.FindTeacher(user);
	}
	
	
	public List<Teacher> queryall(){
		return teacher.queryall();
	}
}
