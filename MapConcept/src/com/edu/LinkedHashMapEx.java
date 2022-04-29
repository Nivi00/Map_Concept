package com.edu;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lob=new LinkedHashMap<Integer,String>();
		lob.put(1, "Charles");
		lob.put(2, "Nivetha");
		lob.put(3, "Neha");
		lob.put(5, "Rathi");
		lob.put(4, "Swathi");
	    System.out.println(lob);
	    
	    System.out.println("");
	    for(Map.Entry<Integer, String> m:lob.entrySet()){  
	    	   System.out.println(m.getKey()+" "+m.getValue()); 

	    }
	}

}
