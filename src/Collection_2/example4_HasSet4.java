package Collection_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class example4_HasSet4 
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		 al.add("rahul");
	     al.add(101);
	     al.add(65.5f);
	     al.add('A');
	     al.add(101);
	     al.add(null);
	     al.add(null);
		
		System.out.println(al);
		
		System.out.println("----------------------");
		
		HashSet hs = new HashSet(al);
		System.out.println(hs);
		
		
		
		
	
	    
	}


}
