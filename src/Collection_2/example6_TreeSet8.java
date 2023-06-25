package Collection_2;

import java.util.Iterator;
import java.util.TreeSet;

public class example6_TreeSet8 
{
  public static void main(String[] args) 
  {
	
   TreeSet<Integer> tr  = new TreeSet();
   
   tr.add(101);
   tr.add(105);
   tr.add(104);
   tr.add(103);
   tr.add(102);
   tr.add(101);
   tr.add(107);
   tr.add(106);
 
   
   
   
   for (Object s1:tr)
   {
	   System.out.println(s1);
   }
   
  }

}
