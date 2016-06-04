package com.hrbhuade.studentManageAction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hrbhuade.util.ResponseUtil;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.alibaba.fastjson.JSON;
import com.hrbhuade.pojo.Student;
import com.hrbhuade.studentManageService.StudentService;


public class StudentAction  implements ServletResponseAware {
	StudentService studentService;
	private HttpServletResponse response;
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}
	public StudentService getStudentService() {
		return studentService;
	}


	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	//List<Student> student;
	Student student;
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
			jsonArray = studentService.queryall();
			
			String json = JSON.toJSONString(jsonArray);
			ResponseUtil.write(response,json);
		}
		else{
			jsonArray = studentService.FindStudent(s_userName);
			String json = JSON.toJSONString(jsonArray);
			ResponseUtil.write(response,json);
		}
		
	}

	public String AddStudent() throws IOException{	
		Student s=new Student(user,password,name);
		studentService.AddStudent(s);
		ResponseUtil.write(response,"{'errorMsg':true}");
		return null;
	}

	public String UpdateStudent() throws IOException{	
		
		Student s=new Student(user,password,name);
		studentService.UpdateStudent(s);
		ResponseUtil.write(response,"{'errorMsg':true}");
		return null;
	}
	private String delIds;
	public String DeleteStudent() throws IOException{	
		
		String[] newstr =delIds.split(",");
		int c= newstr.length;
	
		for(int i= 0 ;i<newstr.length;i++)
		{
			Student s=new Student(newstr[i]);
			studentService.DeleteStudent(s);
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
	/*public static void write(HttpServletResponse response, Object o) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(o.toString());
		out.flush();
		out.close();
	}
	*/
	//Map<String, Object> jsonMap = new HashMap<String, Object>();

	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	/*public Map<String, Object> getJsonMap() {
		return jsonMap;
	}
	public void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}*/
	
	


	

}
