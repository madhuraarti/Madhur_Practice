package Array;

import java.util.Arrays;

public class Example3_intArray3 
{

	public static void main(String[] args)
    {
	       int ar[] =new int[4];    // index start from 0 to 3	        
	        
	       ar[0]=30;
	       ar[1]=20;
	       ar[2]=40;
	       ar[3]=10;
	       
	      System.out.println("------print original info-------");
	      
	      for(int i =0;i<=ar.length-1;i++)
          {
           System.out.println(ar[i]);
          }
	      System.out.println("------print sort-------");
	      
	      Arrays.sort(ar);        //  classname.methodname(arrayObjectiveName)
	      
	      System.out.println("------print data in ascending order-------");
	      
	      for(int i =0;i<=ar.length-1;i++)
          {
           System.out.println(ar[i]);
          }
	      
           System.out.println("------print data in descending order-------");
	      
	      for(int i =ar.length-1; i>=0;i--)
          {
           System.out.println(ar[i]);
          }
	       
    }

}
