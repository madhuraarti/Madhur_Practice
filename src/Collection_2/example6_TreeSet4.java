package Collection_2;

import java.util.TreeSet;

public class example6_TreeSet4 
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
   tr.add(null);
   
   System.out.println(tr); // shows error
   
  
  
  }

}
