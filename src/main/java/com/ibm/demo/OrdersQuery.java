package com.ibm.demo;




import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


import java.util.List;

import com.ibm.demo.Order;;


@Path("/order")
public class OrdersQuery {
	
	
/*
 * http://localhost:6080/DMEDots_JAXWS_WebServices/backend/order/byorderid/200
 * https://localhost:6443/DMEDots_JAXWS_WebServices/backend/order/byorderid/200
 */
	
	@GET 
	@Path("/byorderid/{orderId}")
	@Produces("application/json")
	
	public javax.ws.rs.core.Response getOrder(@PathParam("orderId") String orderId){
		
		System.out.println("inside getOrder byId");
		Order order= OrdersRepository.getOrder(orderId);
		
		return Response.ok() //200
				.entity(order)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.build();
				
				
				
		
	}

	/*
	 * http://localhost:6080/DMEDots_JAXWS_WebServices/dmedots/byowner/Gowtham
	 */
	@GET 
	@Path("/byowner/{ownername}")
	@Produces("application/json")
	public List<Order> getOrdersByOwner(@PathParam("ownername") String ownername){
		return OrdersRepository.getOrdersByOwner(ownername);
		
	}
	
	

	
}
