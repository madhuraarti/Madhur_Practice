package StarPattern;

public class Pattern3 
{
   public static void main(String[] args)
	
	{   
		
		    //***
        	//***  [2*3] order matrix means 2 rows and 3 coloums hence it is called multidimensional pattern
		
	   
	   
	     // step 9        i= 3<=2 false hence our program is terminated
	    // step 5         i=  2<=2 true
		//  step 1        i= 1<=2 true
	   for( int i=1; i<=2;i++)  // outer loop ---> rows
		
	   {  
		   
		       // step 8 j= 4<=4 false 
		      // step 7 j= 3<=3 true
		     // step 6  j= 2<=3 true
		    // step 5   j= 1<=3 true
		   // step 4    j= 4<=3 false 
		  //  step 3    j= 3<=3 true
		  // step 2     j= 2<=3 true
	     //  step1      j= 1<=3 true
		   for (int j=1;j<=3;j++) // inner loop ---> coloums
	     
		   { 
		   System.out.print("*"); // step1 print * , step2 print  * , step 3 print *, 
		   //step 5 print * step 6 print *, step 7 print * , 
		
	      }
	    
		   System.out.println(); // step 4 is false so go to next line, 
		                        // step 8 is false so go to next line
	}
	}
   }
