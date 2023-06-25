package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;



public class vectorOutput 

{
  public static void main(String[] args) 
  {
	Vector v1 = new Vector();
	
	v1.add("rahul");
	v1.add(101);
	v1.add(65.5f);
	v1.add('A');
	v1.add(null);
	v1.add(null);
	v1.add(101);
	
	System.out.println(v1);
	System.out.println(v1.size());
	System.out.println(v1.isEmpty());
	System.out.println(v1.get(0));
	
	// add into between vector
	
	v1.add(2, 400);
	System.out.println(v1);
	
	// remove into between vector
	
	v1.remove(4);
	System.out.println(v1);
	
	// iterator cursor using
	
	System.out.println("-----iterator---------");
	
	Iterator itr = v1.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
	}
	 // list iterator
	
	System.out.println("-----List iterator---------");

   ListIterator ltr = v1.listIterator();
   
   while (ltr.hasNext())
	   
   {
	   System.out.println(ltr.next());
   }
  
   System.out.println("-----enumeration cursor---------");
   
   Enumeration enu = v1.elements();
   
   while(enu.hasMoreElements())
   {
	   System.out.println(enu.nextElement());
   }
  
  }
}
