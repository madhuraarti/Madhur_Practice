package StringClass;

public class Sample16 
{
public static void main(String[] args) 
    
    {
            //Split   
    	   	
       String s1="velocity";
                //01234567 
       String[] ar =s1.split("");  
       
       System.out.println(ar[2]);
       
       System.out.println(ar.length);
       
       System.out.println("--------------");
       
       for(int i=0;i<=ar.length-1;i++)
       {
    	   System.out.println(ar[i]);
       }
       
       
       
    }



}
