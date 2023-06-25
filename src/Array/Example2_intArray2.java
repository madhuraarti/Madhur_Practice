package Array;

public class Example2_intArray2 
{

	public static void main(String[] args)
    {
	       int ar[] =new int[4];    // index start from 0 to 3	        
	        
	       ar[0]=30;
	       ar[1]=20;
	       ar[2]=40;
	       ar[3]=10;
	       
	       System.out.println("---print original info----");   
	       
	       for(int i =0;i<=ar.length-1;i++)
	          {
	           System.out.println(ar[i]);
	          }
	       
	       System.out.println("---print array in reverse order----");  
	       
    
	           //  step 4      0          0=0          10
	           //  step3       1          1>0         20
	          //  step2        2         2>0          40
	         //  step1         3        3>0           10
	       for(int i=ar.length-1; i>=0;  i--)
	       {
	    	   System.out.println(ar[i]);
	       }
    
         //10
	     // 40
	       // 20
	       //10
    
    }

}
