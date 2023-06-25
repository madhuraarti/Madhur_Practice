package StringClass;

public class Sample12 
{

    public static void main(String[] args) 
    
    {
            //combination      
    	   	
       String s1="abcd";
       
       String s2="ABCD";
       
       String s3="velocity";
       
       System.out.println(s1+s2); // abcdABCD
    
       System.out.println("-----------------");
       
          // concat
       
       System.out.println(s1.concat(s2)); // abcdABCD
       
       System.out.println("------------------");
       
       System.out.println(s1+s2+s3); //abcdABCDvelocity
       
       System.out.println("------------------");
       
       System.out.println(s1.concat(s2).concat(s3));   //abcdABCDvelocity
       
    
    }




}
