package StringClass;

public class Sample11 
{

public static void main(String[] args) 
    
    {
        // middle string
        
    	String s1="velocity";  
    	         //01234567
    	         
    	System.out.println(s1.substring(4));   // city
    	
    	System.out.println("--------------");
    
    	System.out.println(s1.substring(6));   // ty
    
    	System.out.println("--------------");
        
    	System.out.println(s1.substring(1));   // elocity
    	
        System.out.println("--------------");
        
    	System.out.println(s1.substring(3,6));   // oci   // 3(starting)(o),(ending)(5+1)5(i)
    	
        System.out.println("--------------");
        
    	System.out.println(s1.substring(1,5));   // eloc   // 1(starting)(e),(ending)(4+1)4(c)
    
    }



}
