package com.hrbhuade.collegeManageService;

import java.util.List;

import com.hrbhuade.pojo.Department;
import com.hrbhuade.pojo.Teachersoffice;
import com.hrbhuade.collegeManageDao.DepartmentDao;
import com.hrbhuade.collegeManageDao.TeachersofficeDao;

public class TeachersofficeService {
	TeachersofficeDao teachersoffice;
	public List<Teachersoffice> FindOffice(String name) {
		return teachersoffice.FindOffice(name);
	}

	public List<Teachersoffice> queryall() {
		return teachersoffice.queryall();
	}
	

	public List<Department> Deptname() {
		return teachersoffice.Deptname();
	}
	
	
	
	public void AddTeachersoffice(Teachersoffice d) {
		teachersoffice.AddTeachersoffice(d);
	}
	
	public void DeleteTeachersoffice(Teachersoffice d){
		teachersoffice.DeleteTeachersoffice(d);
	}
	
	public void UpdateTeachersoffice(Teachersoffice d){
		teachersoffice.UpdateTeachersoffice(d);
	}
	/*public void AddDept(Department d) {
		teachersoffice.AddDept(d);
	}*/
	
	
	public TeachersofficeDao getTeachersoffice() {
		return teachersoffice;
	}

	public void setTeachersoffice(TeachersofficeDao teachersoffice) {
		this.teachersoffice = teachersoffice;
	}
}
