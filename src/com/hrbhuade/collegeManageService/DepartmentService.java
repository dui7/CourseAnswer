package com.hrbhuade.collegeManageService;

import java.util.List;

import com.hrbhuade.collegeManageDao.DepartmentDao;
import com.hrbhuade.pojo.Courses;
import com.hrbhuade.pojo.Department;

public class DepartmentService {
	DepartmentDao department;

	public List<Department> FindCourse(String name) {
		return department.FindCourse(name);
	}

	public List<Department> queryall() {
		return department.queryall();
	}
	
	/*public List<Department> queryname() {
		return department.queryall();
	}
	*/
	public void AddDepartment(Department d) {
		department.AddDepartment(d);
	}
	public void DeleteDepartment(Department d){
		department.DeleteDepartment(d);
	}
	public void UpdateDepartment(Department d){
		department.UpdateDepartment(d);
	}
	public DepartmentDao getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDao department) {
		this.department = department;
	}
}
