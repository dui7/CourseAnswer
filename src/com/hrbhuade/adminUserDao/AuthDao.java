package com.hrbhuade.adminUserDao;

import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hrbhuade.pojo.Auth;

public class AuthDao {
	private SessionFactory sessionfactory ;

	public SessionFactory getSessionFactory() {
		return sessionfactory;
	}

	public void setSessionFactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
	public JSONArray getAuthsByParentId(){
		return null;	
	}
	public JSONArray getAuthByParentId(int parentId,String authIds){
		
		String hql="from Auth where parentId="+parentId+" and authId in ("+authIds+")";
		System.out.println(hql);
		Session session = sessionfactory.openSession();
		Query query = session.createQuery(hql);
		
		List<Auth> result = query.list();
		Iterator it = result.iterator();
		JSONArray jsonArray = new JSONArray();
		while(it.hasNext()){
			Auth auth = new Auth();
			auth =(Auth) it.next();
			JSONObject object = new JSONObject();
			object.put("id", auth.getAuthId());
			object.put("text",auth.getAuthName());
			object.put("parentId", auth.getParentId());
			object.put("state", auth.getState());
			object.put("iconCls", auth.getIconCls());
			JSONObject object2 = new JSONObject();
			object2.put("authPath", auth.getAuthPath());
			object.put("attributes", object2);
			jsonArray.add(object);
		}
		
		return jsonArray;
	}
	public JSONArray getAuthsByParentId(int parentId,String authIds){
		JSONArray jsonArray = getAuthByParentId( parentId, authIds);
		for(int i=0;i<jsonArray.size();i++){
			JSONObject json = jsonArray.getJSONObject(i);
			if(json.getString("state").equals("open")){
				continue;
			}else{
				json.put("children", getAuthsByParentId(json.getInt("id"), authIds));
			}
		}
	
		return jsonArray;
		
	}
}
