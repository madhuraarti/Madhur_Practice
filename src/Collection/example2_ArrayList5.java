package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example2_ArrayList5 
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
	    	    
	    System.out.println("-----print data using for each loop-------------------"); 
	   
	    // it shows all the data of arrays
	   
	        		
	   for (Object s1:al)    
	    	
	    {
	    	System.out.println(s1);
	    }
	   
	   System.out.println("-----------------------"); 
	   
	   System.out.println(al.size());
	   
	   System.out.println("-----------------------"); 
	   
	   al.clear();
	   
	   System.out.println(al.size());
	
	}



}
