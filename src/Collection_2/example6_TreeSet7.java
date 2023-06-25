package Collection_2;

import java.util.Iterator;
import java.util.TreeSet;

public class example6_TreeSet7 
{
  public static void main(String[] args) 
  {
	
   TreeSet tr = new TreeSet();
   
   tr.add(101);
   tr.add(105);
   tr.add(104);
   tr.add(103);
   tr.add(102);
   tr.add(101);
   tr.add(107);
   tr.add(106);
  // tr.add(null);
   
   
   System.out.println(tr); // all are store in ascending order
   System.out.println(tr.isEmpty());
   System.out.println(tr.size());
   
   tr.remove(104);
   
   System.out.println(tr);
   
   System.out.println(tr.first()); // 101
   System.out.println(tr.last());  // 107
   
   
   tr.pollFirst(); // remove element from 1st position
   System.out.println(tr);
   
   tr.pollLast(); // remove element from last position
   
   System.out.println(tr);
   
   System.out.println("-------print all data using iterator--------");
   
   Iterator itr = tr.iterator();
   
   while(itr.hasNext())
   {
	   System.out.println(itr.next());
   }
  
   System.out.println("-------print all data using each loop--------");
   
   for (Object s1:tr)
   {
	   System.out.println(s1);
   }
   
  }

}
