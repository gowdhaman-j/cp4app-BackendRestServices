package com.ibm.demo;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;



@ApplicationPath("/backend/*")
public class BackendApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(Order.class);
        classes.add(OrdersQuery.class);
        //classes.add(OrdersQuery_SSO.class);
        classes.add(User.class);
        classes.add(UserQuery.class);
          
        return classes;
		
	}
	
}
