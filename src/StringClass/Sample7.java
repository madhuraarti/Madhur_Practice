package StringClass;

public class Sample7

{
	public static void main(String[] args) 
	{
	String s1="velocity";
	
	System.out.println(s1.toUpperCase()); // VELOCITY  // WE USE THIS
	
	System.out.println("---------------");
	
    String s2="velocity";
    
    s2=s2.toUpperCase();
    
    System.out.println(s2);  // VELOCITY  // WE DONT USE
	
    System.out.println("---------------");
    
    String s3="MADHUR";
    
    System.out.println(s3.toLowerCase());  // madhur
    
    System.out.println("---------------");
    
    String s4="MADHUR";
    
    s4=s4.toLowerCase();
    
    System.out.println(s4);  // madhur  // we don't use
    
    System.out.println("---------------");
    
    String s5="MADHUR";
          
    System.out.println(s5.charAt(4));  // U  // return type or value is U
    
    System.out.println("---------------");
    
    String s6="MADH UR";
          
    System.out.println(s6.charAt(4));  // blank
    
    System.out.println("---------------");
	
	}	


}
