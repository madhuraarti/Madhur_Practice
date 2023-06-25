package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class example2_ArrayList 
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
	    	    
	    System.out.println("-----print data using Iterator cursor-------------------"); 
	   
	    // it shows all the data of arrays
	   
	    Iterator itr=al.iterator(); // return call to store //no need create an object
	    
	    while(itr.hasNext())     // true
	    	
	    {
	    	System.out.println(itr.next());
	    }
	     
	
	}



}
