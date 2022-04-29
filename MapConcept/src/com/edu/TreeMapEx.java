package com.edu;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Long, String> tob=new TreeMap<Long,String>();
		  tob.put(7358184485l, "Charles");
		  tob.put(8056132425l, "Kennedy");
		  tob.put(8667454570l, "Nivetha");
		  tob.put(9941581751l, "Neha");
		  tob.put(2356123454l, "Rathi");
		  tob.put(6389632531l, "Swathi");
		    System.out.println(tob);
		    
		    System.out.println("");
		    for(Entry<Long, String> m:tob.entrySet()){  
		    	   System.out.println(m.getKey()+" "+m.getValue()); 

		    }
	}
}

