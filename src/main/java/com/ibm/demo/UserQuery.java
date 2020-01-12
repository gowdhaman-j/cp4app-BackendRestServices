package com.ibm.demo;



import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.ibm.json.java.JSONObject;


@Path("/user")
public class UserQuery {
	
	@POST
	@Path("/byuserid")
	//@Consumes ("application/x-www-form-urlencoded")
	@Consumes ("application/json")
	@Produces("application/json")
public  User  getUserProfile( String msg ) throws Exception{
		String userId="";
		com.ibm.json.java.JSONObject jsonObj = new com.ibm.json.java.JSONObject();
		jsonObj.parse(msg);
		userId = (String) jsonObj.get("userId");
		System.out.println("inside getUserProfile byId --" +msg+userId);
		return UserRepository.getUserProfile(userId); 
		
		
	}

}
