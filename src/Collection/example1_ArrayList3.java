package Collection;

import java.util.ArrayList;

public class example1_ArrayList3 
{

	public static void main(String[] args) 
	{
		// ArrayList<E> we have to remove <E> 
		
		ArrayList al = new ArrayList(); // Default capacity = 10
		
		// (1) Default capacity for arraylist is 10
	
	     al.add("rahul");
	     al.add(101);
	     al.add(65.5f);
	     al.add('A');
	     
	     System.out.println(al);
	     System.out.println(al.size()); // 4
	     System.out.println(al.isEmpty());  // false // since there is no any empty in array list
	
	
	}



}
