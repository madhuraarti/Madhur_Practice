package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example2_ArrayList3 
{

	public static void main(String[] args) 
	{
		
		
		ArrayList al = new ArrayList(8);// initial capacity=8
		
					
	     al.add("rahul"); // 0
	     al.add(101);     // 1
	     al.add(65.5f);   // 2
	     al.add('A');    //  3
	     al.add(101);    //  4
	     al.add(null);  //   5 
	     al.add(null);  //   6
	    	    
	    System.out.println("-----print data using for loop-------------------"); 
	   
	    // it shows all the data of arrays
	   
	    
	    		
	   for (int i=0; i<=al.size()-1; i++)    
	    	
	    {
	    	System.out.println(al.get(i));
	    }
	     
	
	}



}
