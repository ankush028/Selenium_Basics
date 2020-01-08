package com.bridgelabz.selenium.hashmap;

import java.util.HashMap;

public class Data {
	
	public  static HashMap<String,String>  userLoginInfo() {
			
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("facebook","8100555221_Test@123");	
		map.put("linkedin","akag006@gmail.com_Test@123");
		
//		Set<String> keys = map.keySet();
//		
//		for(String key : keys) {
//			System.out.println("Keys of maps :"+key);
//		}
		return map;
	}
	
		public static HashMap<Integer,String> monthMap() {
			HashMap<Integer, String> month = new HashMap<Integer, String>();
			month.put(0,"Month");
			month.put(1,"Jan");
			month.put(2,"Feb");
			month.put(3,"Mar");
			month.put(4,"Apr");
			month.put(5,"May");
			month.put(6,"Jun");
			month.put(7,"Jul");
			month.put(8,"Aug");
			month.put(9,"Sept");
			month.put(10,"Oct");
			month.put(11,"Nov");
			month.put(12,"Dec");
			
			return month;

		}
}
