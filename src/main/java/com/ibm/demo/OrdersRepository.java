package com.ibm.demo;

import java.util.HashMap;

import com.ibm.demo.Order;


import java.util.Map;
import java.util.Date;
import java.lang.Double;
import java.util.List;
import java.util.ArrayList;
public class OrdersRepository {

	private static final Map<String,Order>OrdersRepos = new HashMap<String,Order>();
		static {
			Order Order_200= new Order("200",new Date(),new Double(2000.00),"John Doe");
			Order Order_201= new Order("201",new Date(),new Double(2001.00),"Robin Hood");
			Order Order_202= new Order("202",new Date(),new Double(2002.00),"Gowtham");
			Order Order_203= new Order("203",new Date(),new Double(2003.00),"Dhanush");
			Order Order_204= new Order("204",new Date(),new Double(2004.00),"Gowtham");
			
			OrdersRepos.put("200", Order_200);
			OrdersRepos.put("201", Order_201);
			OrdersRepos.put("202", Order_202);
			OrdersRepos.put("203", Order_203);
			OrdersRepos.put("204", Order_204);
			
			
		};
		
		public static Order getOrder(String orderId){
			
			Order order=null;
			try {
				order=OrdersRepos.get(orderId);
			} catch (Exception e) {
				// TODO: handle exception
				
			}finally{
				if (order==null){
					order=new Order("000", new Date(), new Double(00.00),"No Orders Found");
				}
			}
			
		 
		    return order;
			
}
		
		public static List<Order> getOrdersByOwner(String orderOwner){
			System.out.println("Inside geOrdersByOwner");
			List<Order> ListofOrder = new ArrayList<Order>();
			for (Map.Entry<String, Order> entry : OrdersRepos.entrySet()) {
		    String key = entry.getKey();
		    Order value = entry.getValue();
		    System.out.println("Input Order Owner = " + orderOwner);
		    System.out.println("Value inside Order Object ="+ value.getOrderOwner());
		    if( orderOwner.equalsIgnoreCase(value.getOrderOwner())  ){
		    	System.out.println("Matching!!!!!!!");
		    	ListofOrder.add(value);
		    	
		    	}
			}
			return ListofOrder;
		}
		
}
