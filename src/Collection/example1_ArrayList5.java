package Collection;

import java.util.ArrayList;

public class example1_ArrayList5 
{

	public static void main(String[] args) 
	{
		// ArrayList<E> we have to remove <E> 
		
		//ArrayList al = new ArrayList(); // initial /by Default capacity = 10
		
		ArrayList al = new ArrayList(8);// initial capacity=8
		
		// incremental capcity =(8*3/2)+1=13 so 13 is the maximum capacity
			
	     al.add("rahul");
	     al.add(101);
	     al.add(65.5f);
	     al.add('A');
	     al.add(101);
	     al.add(null);
	     al.add(null);
	     al.add(101);
	     al.add(101);
	     
	    
	     
	     System.out.println(al);
	     System.out.println(al.size()); // 4
	     System.out.println(al.isEmpty());  // false // since there is no any empty in array list
	
	
	}



}
