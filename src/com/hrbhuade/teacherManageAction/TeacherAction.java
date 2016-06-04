package com.hrbhuade.teacherManageAction;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.alibaba.fastjson.JSON;
import com.hrbhuade.pojo.Teacher;
import com.hrbhuade.teacherManageService.TeacherService;;


public class TeacherAction  implements ServletResponseAware {


	TeacherService teacherService;
	public TeacherService getTeacherService() {
		return teacherService;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	private HttpServletResponse response;
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}
	
	Teacher teacher;
	private String user;
	private String password;
	private String name;
	private String s_userName;
	
	
	
	public String getS_userName() {
		return s_userName;
	}
	public void setS_userName(String s_userName) {
		this.s_userName = s_userName;
	}
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
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
			jsonArray = teacherService.queryall();
			String json = JSON.toJSONString(jsonArray);
			write(response,json);
		}
		else{
			jsonArray = teacherService.FindTeacher(s_userName);
			String json = JSON.toJSONString(jsonArray);
			write(response,json);
		}
		
	}

	public String AddTeacher() throws IOException{	
		Teacher s=new Teacher(user,password,name);
		teacherService.AddTeacher(s);
		write(response,"{'errorMsg':true}");
		return null;
	}

	public String UpdateTeacher() throws IOException{	
		
		Teacher s=new Teacher(user,password,name);
		teacherService.UpdateTeacher(s);
		write(response,"{'errorMsg':true}");
		return null;
	}
	
	
	private String delIds;
	public String DeleteTeacher() throws IOException{	
		
		String[] newstr =delIds.split(",");
		int c= newstr.length;
		for(int i= 0 ;i<newstr.length;i++)
		{
			Teacher s=new Teacher(newstr[i]);
			teacherService.DeleteTeacher(s);
		}
		write(response,"{'success':true,'delNums':"+c+"}");

		return null;
	}
	public String getDelIds() {
		return delIds;
	}
	public void setDelIds(String delIds) {
		this.delIds = delIds;
	}
	
	
	public static void write(HttpServletResponse response, Object o) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(o.toString());
		out.flush();
		out.close();
	}
	



}
