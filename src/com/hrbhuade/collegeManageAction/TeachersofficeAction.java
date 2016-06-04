package com.hrbhuade.collegeManageAction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.alibaba.fastjson.JSON;
import com.hrbhuade.collegeManageService.TeachersofficeService;
import com.hrbhuade.pojo.Department;
import com.hrbhuade.pojo.Teachersoffice;
import com.hrbhuade.util.ResponseUtil;

public class TeachersofficeAction implements ServletResponseAware {
	TeachersofficeService teachersofficeService;
	Teachersoffice teachersoffice;
	private HttpServletResponse response;

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}
	private Integer user;
	private String name;
	private String dept;
	private Integer deptno;
	
	public Integer getDeptno() {
		return deptno;
	}



	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	private Integer deptname;
	


	public Integer getDeptname() {
		return deptname;
	}



	public void setDeptname(Integer deptname) {
		this.deptname = deptname;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}
	private String s_userName;
	
	
	
	
	
	public void queryall() throws IOException {
		List jsonArray = new ArrayList();
		if(s_userName==null)
		{
			
			jsonArray = teachersofficeService.queryall();
			String json = JSON.toJSONString(jsonArray);
			ResponseUtil.write(response,json);
		}
		else{
			jsonArray = teachersofficeService.FindOffice(s_userName);
			String json = JSON.toJSONString(jsonArray);
			ResponseUtil.write(response,json);
		}
		
	}
	
	public void Deptname() throws IOException {
		
		List jsonArray = new ArrayList();
		
		jsonArray = teachersofficeService.Deptname();
		Map<String, Object> jsonMap = new HashMap<String, Object>();	
		jsonMap.put("dept",jsonArray);
			String json = JSON.toJSONString(jsonMap);
		ResponseUtil.write(response,json);
		
		
	}
	

	public String AddTeachersoffice() throws IOException{
		
		Teachersoffice s=new Teachersoffice();
		s.setTeachersOfficeName(name);
		Department d=new Department();
		s.setDepartment(d);
		d.setDepartmentNo(deptname);
		teachersofficeService.AddTeachersoffice(s);
		//teachersofficeService.AddDept(d);

		ResponseUtil.write(response,"{'errorMsg':true}");
		return null;
	}

	public String UpdateTeachersoffice() throws IOException{	

		Teachersoffice s=new Teachersoffice(); 
		s.setTeacherOfficeId(user);
		s.setTeachersOfficeName(name);
		Department d=new Department();
		s.setDepartment(d);
		d.setDepartmentNo(deptname);
		teachersofficeService.UpdateTeachersoffice(s);
		ResponseUtil.write(response,"{'errorMsg':true}");
		return null;
	}
	
	private String delIds;
	public String DeleteTeachersoffice() throws IOException{	
		String[] newstr =delIds.split(",");
		int c= newstr.length;
		
		for(int i= 0 ;i<newstr.length;i++)
		{
			int no=Integer.parseInt(newstr[i]);
			Teachersoffice s=new Teachersoffice(); 
			s.setTeacherOfficeId(no);
			teachersofficeService.DeleteTeachersoffice(s); 
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
	
	public TeachersofficeService getTeachersofficeService() {
		return teachersofficeService;
	}

	public void setTeachersofficeService(TeachersofficeService teachersofficeService) {
		this.teachersofficeService = teachersofficeService;
	}

	public Teachersoffice getTeachersoffice() {
		return teachersoffice;
	}

	public void setTeachersoffice(Teachersoffice teachersoffice) {
		this.teachersoffice = teachersoffice;
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

	public String getS_userName() {
		return s_userName;
	}

	public void setS_userName(String s_userName) {
		this.s_userName = s_userName;
	}
}
