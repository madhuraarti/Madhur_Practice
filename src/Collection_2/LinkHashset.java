package Collection_2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashset 
{
  public static void main(String[] args) 
  {
	 LinkedHashSet lhs = new LinkedHashSet();
     
	 lhs.add("rahul");
	 lhs.add(101);
	 lhs.add(65.5f);
	 lhs.add('A');
	 lhs.add('A');
	 lhs.add(null);
	 lhs.add(null);
	 
	    System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		
		lhs.remove(101);
		System.out.println(lhs);
		
		System.out.println("-------print data using iterator----------");
		
		Iterator ltr = lhs.iterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		for (Object s1:lhs)    
	    	
	    {
	    	System.out.println(s1);
	    }
	 
		System.out.println("-----------------------"); 
		   
		   lhs.clear();
		   
		   System.out.println(lhs.size());
  
  }
}
