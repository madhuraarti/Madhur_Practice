package Array;

public class intArray1 
{

	public static void main(String[] args)
    {
	       int ar[] =new int[4];    // index start from 0 to 3	        
	        
	       ar[0]=30;
	       ar[1]=20;
	       ar[2]=40;
	       ar[3]=10;
	       
	       System.out.println(ar[1]);   // 20
	       System.out.println(ar[2]);  // 40
          System.out.println("----length find-------");
          System.out.println(ar.length);
          
          System.out.println("---Print all info from int array-------");
          
          for(int i=0; i<=3; i++)
        	  
          {
        	  System.out.println(ar[i]);
          }
          
    }



}
