package com.hrbhuade.collegeManageAction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.alibaba.fastjson.JSON;
import com.hrbhuade.collegeManageService.DepartmentService;
import com.hrbhuade.pojo.Courses;
import com.hrbhuade.pojo.Department;
import com.hrbhuade.util.ResponseUtil;

public class DepartmentAction implements ServletResponseAware{
	DepartmentService departmentService;
	Department department;
	
	private HttpServletResponse response;
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}
	private Integer user;
	private String name;
	private String s_userName;
	public String getS_userName() {
		return s_userName;
	}
	public void setS_userName(String s_userName) {
		this.s_userName = s_userName;
	}
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
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
			
			jsonArray = departmentService.queryall();
			String json = JSON.toJSONString(jsonArray);
			ResponseUtil.write(response,json);
		}
		else{
			jsonArray = departmentService.FindCourse(s_userName);
			String json = JSON.toJSONString(jsonArray);
			ResponseUtil.write(response,json);
		}
		
	}
	

	/*public void queryname() throws IOException {
		
		System.out.println("queryname");
		List jsonArray = new ArrayList();
		

			jsonArray = departmentService.queryname();
			for (int i = 0; i < jsonArray.size(); i++) {
			    System.out.println(jsonArray.get(i));
			}
			
			String json = JSON.toJSONString(jsonArray);
			ResponseUtil.write(response,json);
		
		
	}*/
	
	public String AddDepartment() throws IOException{
		
		Department s=new Department(user,name);
		
		departmentService.AddDepartment(s);
		ResponseUtil.write(response,"{'errorMsg':true}");
		return null;
	}
	
	private String delIds;
	public String DeleteDepartment() throws IOException{	
		String[] newstr =delIds.split(",");
		int c= newstr.length;
		
		for(int i= 0 ;i<newstr.length;i++)
		{
			int a=Integer.parseInt(newstr[i]);
			Department s=new Department(a); 
			departmentService.DeleteDepartment(s); 
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
	
	public String UpdateDepartment() throws IOException{	
		System.out.println(user);
		System.out.println("123");
		Department s=new Department(user,name); 
		departmentService.UpdateDepartment(s);
		ResponseUtil.write(response,"{'errorMsg':true}");
		return null;
	}
}
