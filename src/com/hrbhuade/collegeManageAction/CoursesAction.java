package com.hrbhuade.collegeManageAction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.alibaba.fastjson.JSON;
import com.hrbhuade.collegeManageService.CoursesService;
import com.hrbhuade.pojo.Courses;
import com.hrbhuade.util.ResponseUtil;;
public class CoursesAction implements ServletResponseAware {


	CoursesService coursesService;
	
	private HttpServletResponse response;
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}
	
	Courses courses;
	private Integer user;
	public void setUser(Integer user) {
		this.user = user;
	}

	private String password;
	private String name;
	private String s_userName;
	
	
	
	public String getS_userName() {
		return s_userName;
	}
	public void setS_userName(String s_userName) {
		this.s_userName = s_userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void queryall() throws IOException {
		List jsonArray = new ArrayList();
		if(s_userName==null)
		{
			jsonArray = coursesService.queryall();
			String json = JSON.toJSONString(jsonArray);
			ResponseUtil.write(response,json);
		}
		else{
			jsonArray = coursesService.FindCourse(s_userName);
			String json = JSON.toJSONString(jsonArray);
			ResponseUtil.write(response,json);
		}
		
	}

	public String AddCourses() throws IOException{	
		Courses s=new Courses(name);
		coursesService.AddCourses(s);
		ResponseUtil.write(response,"{'errorMsg':true}");
		return null;
	}
	
	public String UpdateCourses() throws IOException{	
		System.out.println(user);
		Courses s=new Courses(user,name); 
		coursesService.UpdateCourses(s);
		ResponseUtil.write(response,"{'errorMsg':true}");
		return null;
	}
	
	
	private String delIds;
	public String DeleteCourses() throws IOException{	
		String[] newstr =delIds.split(",");
		int c= newstr.length;
		
		for(int i= 0 ;i<newstr.length;i++)
		{
			int a=Integer.parseInt(newstr[i]);
			Courses s=new Courses(a); 
			coursesService.DeleteCourses(s); 
		}
		ResponseUtil.write(response,"{'success':true,'delNums':"+c+"}");

		return null;
	}
	public String getDelIds() {
		return delIds;
	}
	public void setDelIds(String delIds) {
		this.delIds = delIds;
	}
	
	
	public Courses getCourses() {
		return courses;
	}
	public CoursesService getCoursesService() {
		return coursesService;
	}
	public void setCoursesService(CoursesService coursesService) {
		this.coursesService = coursesService;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	
}
