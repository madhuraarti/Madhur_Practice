package LogicalProgram;

public class example2_factorialNum 
{

      public static void main (String[] args)
       
       {
	
          int num=4;      // 4*3*2*1  =24
          int fact=1;
          //          0      0 not equal to 1 false
         
          //          1      1=1  0
          
          //          2     2>=1  1
          
          //          3     3>=1  2
          
          //          4     4>=1  3
          for (int i=num;  i>=1; i--)
          {
        	  
        	  fact=fact*i;   // 1*4 =4 since fact =1
        	                 // 4*3 =12  since fact =4
        	                // 12*2 = 24 since fact = 24
        	                // 24*1 = 24  since fact =24
        	                
          }
       
           System.out.println(fact);
       }


}
