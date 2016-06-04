package com.hrbhuade.adminUserAction;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.hrbhuade.adminUserService.AuthService;
import com.hrbhuade.util.ResponseUtil;
import com.opensymphony.xwork2.ActionSupport;

public class AuthAction extends ActionSupport implements ServletResponseAware {

	private static final long serialVersionUID = 1L;
	private String parentId;
	private AuthService authService;
	JSONArray jsonarray;
	public JSONArray getJsonarray() {
		return jsonarray;
	}

	public void setJsonarray(JSONArray jsonarray) {
		this.jsonarray = jsonarray;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String execute() throws IOException {
	  jsonarray = authService.getAuth("1");
		System.out.println(jsonarray.toString());
		ResponseUtil.write(response, jsonarray.toString());
		
		return null;
	}
	private  HttpServletResponse response;

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}
	public AuthService getAuthService() {
		return authService;
	}

	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}
}
