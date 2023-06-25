package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example3_LinkedList

{

public static void main(String[] args) 
{
	LinkedList ll = new LinkedList(); // no default capacity
	
	ll.add("mahesh");     // 0
	ll.add(105);          //  1
	ll.add(75.5f);        // 2
	ll.add('B');          // 3
	ll.add("mahesh");   // 4
	ll.add(null);        // 5
	ll.add(null);
	
	System.out.println(ll);
	System.out.println(ll.size());// 7
	System.out.println(ll.isEmpty());
	System.out.println(ll.get(1));
	
	System.out.println("-------updated and modified----------");
	
	// update and modified
	
	//ll.set(index, element)
	
	ll.set(5, "kalpesh");  // null value replaced
	
	System.out.println(ll);
	
	System.out.println("-------add----------");
    
	// add info in between LinkedList
	//ll.add(index, element);
	
	ll.add(4, "abc");
	System.out.println(ll);
	
	System.out.println("-------remove----------");
	
	// remove info in between linkList
	ll.remove(4);
	System.out.println(ll);
	
	// print data using iterator cursor
	
	System.out.println("-------print data using iterator----------");
	
	Iterator itr = ll.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
 
	// print data using ListIterator cursor
	
	
	System.out.println("-------print data using list iterator----------");
	
	ListIterator litr = ll.listIterator();
	
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}

  System.out.println("-------print data using for loop ----------");
  
  for(int i=0 ; i<=ll.size()-1;i++)
	  
  {
	  System.out.println(ll.get(i));
  }

System.out.println("-------print data using for each loop ----------");
 
   for (Object s1:ll)
 {
	 System.out.println(s1);
 }
 
   System.out.println("-------clear----------");
  
   ll.clear();
   
   System.out.println(ll.size());

}


}
