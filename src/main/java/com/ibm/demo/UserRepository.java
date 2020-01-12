package com.ibm.demo;

import java.util.HashMap;
import com.ibm.demo.User;
import java.util.Map;

public class UserRepository {

	private static final Map<String,User>UserRepos = new HashMap<String,User>();
		static {
			
			
			User  User_100 = new User("100","John","Doe","Finance","Programmer Analyst Trainee", "User"); 
			User  User_101 = new User("101","Robin","Hood","Marketting","Research Analyst Trainee", "User"); 
			User  User_102 = new User("102","Gowtham","Jayaseelan","Research","Research Analyst ", "super user"); 
			

			
			UserRepos.put("100", User_100);
			UserRepos.put("101", User_101);
			UserRepos.put("102", User_102);
			
	
			
			
		};
		
		public static User getUserProfile(String userId){
			
			User user=null;
			try {
				user=UserRepos.get(userId);
			} catch (Exception e) {
				// TODO: handle exception
				
			}finally{
				if (user==null){
					user=new User("xx","xx","xx","xx","xx ", "yy");
				}
			}
			
		 
		    return user;
			
}
		

		
}
