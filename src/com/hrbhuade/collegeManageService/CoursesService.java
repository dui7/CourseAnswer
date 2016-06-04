package com.hrbhuade.collegeManageService;

import java.util.List;

import com.hrbhuade.pojo.Courses;
import com.hrbhuade.pojo.Student;
import com.hrbhuade.collegeManageDao.CoursesDao;


public class CoursesService {
	CoursesDao courses;
	
	public CoursesDao getCourses() {
		return courses;
	}

	public void setCourses(CoursesDao courses) {
		this.courses = courses;
	}

	public List<Courses> FindCourse(String user){
		return courses.FindCourse(user);
	}
	
	public List<Courses> queryall(){
		return courses.queryall();
	}
	

	public void AddCourses(Courses d) {
		courses.AddCourses(d);
	}
	public void UpdateCourses(Courses d){
		courses.UpdateCourses(d);
	}
	
	public void DeleteCourses(Courses d){
		courses.DeleteCourses(d);
	}
	
}
