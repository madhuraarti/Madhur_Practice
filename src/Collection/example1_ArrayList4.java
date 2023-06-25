package Collection;

import java.util.ArrayList;

public class example1_ArrayList4 
{

	public static void main(String[] args) 
	{
		// ArrayList<E> we have to remove <E> 
		
		ArrayList al = new ArrayList(); // Default capacity = 10
		
		//(3) allows any no of null values // if add null then array will be increased
		//(4) Storage type: index ie 7
		//(5) order of insertion // ie all data will be stored in sequence or in order
		
		
	     al.add("rahul");
	     al.add(101);
	     al.add(65.5f);
	     al.add('A');
	     al.add(101);
	     al.add(null);
	     al.add(null);

	     
	    
	     
	     System.out.println(al);
	     System.out.println(al.size()); // 4
	     System.out.println(al.isEmpty());  // false // since there is no any empty in array list
	
	
	}



}
