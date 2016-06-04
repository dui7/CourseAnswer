package com.hrbhuade.adminUserService;

import net.sf.json.JSONArray;

import org.springframework.transaction.annotation.Transactional;

import com.hrbhuade.adminUserDao.AuthDao;
import com.hrbhuade.adminUserDao.RoleDao;

public class AuthService {
	private RoleDao roleDao;
	private AuthDao authDao;
	public RoleDao getRoleDao() {
		return roleDao;
	}
	public AuthDao getAuthDao() {
		return authDao;
	}
	public void setAuthDao(AuthDao authDao) {
		this.authDao = authDao;
	}
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	@Transactional
	public JSONArray getAuth(String parentId) {
		String authIds = roleDao.getAuthIdsById(parentId);
		JSONArray jsonarray=authDao.getAuthsByParentId(-1,authIds);
		return jsonarray;
	}
}
