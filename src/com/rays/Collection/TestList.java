package com.rays.Collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String [] args) {
		
		List l = new ArrayList();
		
		l.add("Anish");
		l.add("abhishek");
	    l.add("kanak");
	    l.add("sandeep");
	    l.add("uday");
	    
	    for(int i = l.size()-1; i >=0; i-- ) {
	    	
	    	System.out.println(l.get(i));
	    }
	}

}