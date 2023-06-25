package StringClass;

public class Sample15 
{
public static void main(String[] args) 
    
    {
            //Split   
    	   	
       String s1="velocity";
       
       String[] ar =s1.split("o");  // "{velo(0)  city(1) "};
       
       System.out.println(ar[1]);
       
       System.out.println(ar.length);
       
       System.out.println("--------------");
       
       for(int i=0;i<=ar.length-1;i++)
       {
    	   System.out.println(ar[i]);
       }
       
       
       
    }


}
