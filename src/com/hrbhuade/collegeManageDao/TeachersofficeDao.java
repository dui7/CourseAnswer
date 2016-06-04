package com.hrbhuade.collegeManageDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hrbhuade.pojo.Department;
import com.hrbhuade.pojo.Teachersoffice;

public class TeachersofficeDao {
	SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public List<Teachersoffice> FindOffice(String d) {

		Session sess = sf.openSession();
		Query y = sess
				.createQuery("select new Map( office.teacherOfficeId as oid,office.teachersOfficeName as oname,dep.departmentName as dname )from Teachersoffice office,Department dep where office.teachersOfficeName LIKE :teachersOfficeName and office.department=dep order by dep.departmentName desc");
		y.setString("teachersOfficeName", "%" + d + "%");
		List<Map> list2 = y.list();

		List jsonArray = new ArrayList();
		for (Map map : list2) {

			// System.out.println(map.get("oid"));

			Map<String, Object> jsonMap = new HashMap<String, Object>();
			jsonMap.put("user", map.get("oid"));
			jsonMap.put("name", map.get("oname"));
			jsonMap.put("dept", map.get("dname"));

			jsonArray.add(jsonMap);
		}
		sess.close();
		return jsonArray;
		/*
		 * List<Teachersoffice> list2 = y.list(); List jsonArray = new
		 * ArrayList(); for (Teachersoffice teachersoffice : list2) {
		 * Map<String, Object> jsonMap = new HashMap<String, Object>();
		 * 
		 * jsonMap.put("user", teachersoffice.getTeacherOfficeId());
		 * jsonMap.put("name", teachersoffice.getTeachersOfficeName()); //
		 * jsonMap.put("name", courses.getTeachersoffice());
		 * 
		 * jsonArray.add(jsonMap); }
		 * 
		 * sess.close(); return jsonArray;
		 */
	}

	public List<Teachersoffice> queryall() {
		Session sess = sf.openSession();
		Query y = sess
				.createQuery("select new Map( office.teacherOfficeId as oid,office.teachersOfficeName as oname,dep.departmentName as dname )from Teachersoffice office,Department dep where office.department=dep order by dep.departmentName desc");
		// Query y = sess.createQuery("from Teachersoffice ");
		List<Map> list2 = y.list();

		List jsonArray = new ArrayList();
		for (Map map : list2) {

			// System.out.println(map.get("oid"));

			Map<String, Object> jsonMap = new HashMap<String, Object>();
			jsonMap.put("user", map.get("oid"));
			jsonMap.put("name", map.get("oname"));
			jsonMap.put("dept", map.get("dname"));

			jsonArray.add(jsonMap);
		}
		sess.close();
		return jsonArray;

	}

	public List<Department> Deptname() {
		Session sess = sf.openSession();
		Query y = sess.createQuery("from Department");
		List<Department> list2 = y.list();
		List jsonArray = new ArrayList();
		for (Department department : list2) {
			Map<String, Object> jsonMap = new HashMap<String, Object>();
			// System.out.println(department.getDepartmentName());
			jsonMap.put("deptno", department.getDepartmentNo());
			jsonMap.put("deptname", department.getDepartmentName());

			// jsonMap.put("name", teachersoffice.getTeachersOfficeName());
			// jsonMap.put("name", courses.getTeachersoffice());

			jsonArray.add(jsonMap);
		}

		sess.close();
		return jsonArray;

	}

	public void AddTeachersoffice(Teachersoffice d) {
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.save(d);
		tra.commit();
		sess.close();
	}

	public void UpdateTeachersoffice(Teachersoffice d) {

		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.update(d);
		tra.commit();
		sess.close();
	}

	public void DeleteTeachersoffice(Teachersoffice d) {
		Session sess = sf.openSession();
		Transaction tra = sess.beginTransaction();
		sess.delete(d);
		tra.commit();
		sess.close();
	}
	/*
	 * public void AddDept(Department d) { Session sess = sf.openSession();
	 * Transaction tra = sess.beginTransaction(); sess.save(d); tra.commit();
	 * sess.close(); }
	 */
}
