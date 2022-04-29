package com.edu;

import java.util.HashMap;
import java.util.Map;



public class HashMapEx {

	public static void main(String[] args) {
	HashMap<Integer, String> hob=new HashMap<Integer,String>();
	hob.put(1, "Charles");
	hob.put(2, "Nivetha");
	hob.put(3, "Neha");
	
    System.out.println(hob);
    
    System.out.println("");
    for(Map.Entry<Integer, String> m:hob.entrySet()){  
    	   System.out.println(m.getKey()+" "+m.getValue()); 

    }
    
	}

}
