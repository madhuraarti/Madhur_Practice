package StringClass;

public class Sample5 
{

      public static void main(String[] args) 
      {
		String s1="velocity";
		
		System.out.println(s1.length());   // 8
	  
		System.out.println("----------------------");
		
        String s2="velo  city";
		
		System.out.println(s2.length()); // 10
      
      System.out.println("--------------------");
       
      String s3="velocity";
      System.out.println(s3.isEmpty()); // false
      
      System.out.println("--------------------");
      
      String s4="";
      System.out.println(s4.isEmpty());  // true
      
      System.out.println("--------------------");
      
      String s5=" ";
      System.out.println(s5.isEmpty()); // false
      
      }


}
