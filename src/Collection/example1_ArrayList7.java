package Collection;

import java.util.ArrayList;

public class example1_ArrayList7 
{

	public static void main(String[] args) 
	{
		// ArrayList<E> we have to remove <E> 
		
		//ArrayList al = new ArrayList(); // initial /by Default capacity = 10
		
		ArrayList al = new ArrayList(8);// initial capacity=8
		
		// incremental capcity =(8*3/2)+1=13 so 13 is the maximum capacity
			
	     al.add("rahul"); // 0
	     al.add(101);     // 1
	     al.add(65.5f);   // 2
	     al.add('A');    // 3
	     al.add(101);    // 4
	     al.add(null);
	     al.add(null);
	    	    
	     
	     System.out.println(al);
	     System.out.println(al.size()); // 4
	     System.out.println(al.isEmpty());  // false // since there is no any empty in array list
	     System.out.println(al.get(4));
	
	}



}
