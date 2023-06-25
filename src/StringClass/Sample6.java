package StringClass;

public class Sample6 
{

	public static void main(String[] args) 
    {
		String s1=null;
		
		System.out.println(s1);   // null
	  
		System.out.println("----------------------");
		
		String s2="";
		
		System.out.println(s2.length()); //0
		
		System.out.println("----------------------");
		
		String s3="abcd";
		
		String s4="ABCD";
		
		System.out.println(s3.equals(s4));  // false
		
		System.out.println(s3.equalsIgnoreCase(s4)); // true
		
		System.out.println("----------------------");
		
		String s5="my name is abc";
		
		System.out.println(s5.contains("abc"));
		
        System.out.println("----------------------");
		
		String s6="my name is abc";
		
		System.out.println(s6.contains("Abc"));
		
        System.out.println("----------------------");
		
		String s7="my name is abc";
		
		System.out.println(s6.contains("is"));
		
        System.out.println("----------------------");
		
		String s8="my name is abc";
		
		System.out.println(s6.contains("Is"));
      
    
    }







}
