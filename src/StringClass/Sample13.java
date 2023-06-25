package StringClass;

public class Sample13 
{

public static void main(String[] args) 
    
    {
            //replace     
    	   	
       String s1="my name is khan";
       
       System.out.println(s1);   //"my name is khan";
       
       System.out.println("--------------");
       
       System.out.println(s1.replace("khan", "chauhan")); // (s1.replace(oldChar, newChar)); 
                                                          // Ans:my name is chauhan // not reinitialised

       System.out.println("--------------");
         
       // for reinitialised
       
       s1=s1.replace("khan", "pattan");   //s1=s1.replace(oldChar, newChar)
    
       System.out.println(s1);
    
    }

}
