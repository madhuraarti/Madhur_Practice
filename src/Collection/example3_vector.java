package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example3_vector 
{

	public static void main(String[] args) 
	{
		// select all program then control F then replace al by V 
		
		Vector V = new Vector();	
				
	     V.add("rahul"); // 0
	     V.add(101);     // 1
	     V.add(65.5f);   // 2
	     V.add('A');    //  3
	     V.add(101);    //  4
	     V.add(null);
	     V.add(null);
	    	    
	     
	     System.out.println(V);
	     System.out.println(V.size()); // 4
	     System.out.println(V.isEmpty());  // false // since there is no any empty in Vector
	     System.out.println(V.get(2));
	
	  // remoVe info in between Vector  --->right shift operation
	    // V.add(index, element);
	     V.add(4, 500);
	     System.out.println(V);
	    
	     System.out.println("---------------------------------------------------------");
	     
	     // remoVe info in between Vector  --->right shift operation
	     V.remove(4);
	     System.out.println(V);
	     
	     System.out.println("-----print data using Vector-------------------"); 
	     Iterator itr=V.iterator(); // return call to store //no need create an object
		    
		    while(itr.hasNext())     // true
		    	
		    {
		    	System.out.println(itr.next());
		    }  
		   
	     
	     // it shows all the data of Vector
		   
		    ListIterator litr=V.listIterator();
		    		
		    while(litr.hasNext())     // true //  if false then loop will be brokened 
		    	// hasNext is used for to Verify the data whether it is present or not
		    	
		    {
		    	System.out.println(litr.next());
		    }
	
		    for (int i=0; i<=V.size()-1; i++)    
		    	
		    {
		    	System.out.println(V.get(i));
		    }
	
		    for (Object s1:V)    
		    	
		    {
		    	System.out.println(s1);
		    }
		   
		   System.out.println("-----------------------"); 
		   
		   System.out.println(V.size());
	
		   System.out.println("-----------------------"); 
		   
		   V.clear();
		   
		   System.out.println(V.size());
		   
		   System.out.println("-----print data using for enumeration cursor------------------"); 
	       
		   Enumeration enu = V.elements();
	
	
		   while(enu.hasMoreElements())
	    
		   {
		       System.out.println(enu.nextElement());
	       }
	
		
	}



}
