package StarPattern;

public class Pattern5 
{
   public static void main(String[] args)
	
	{   
		   // *
		    //**
        	//***  
		
	      
	   int star =1;      // for star print (*)
	  
	   //  step 1    i=1<3    true
	   // step 2     i=2<3    true
	   // step 6     i=3<=3 true
	   // step 10    i=4<=3 false stop program
	   
	   for( int i=1; i<=3;i++)  // outer loop ---> rows
		
	   {  
		 // step 1 // if true ie i=1<=3
		 // step 2//  go to next  loop statements
	       
		    // step 9 j=4<=3 false
		    // step 8 j=3<=3 true
		   // step 7  j=2<=3 true
		   // step 6  j=1<=3 true
		     // step 5 j=3<=2 false  
		     // step 4 j=2<=2 true
		    // step 3  j=1<=2 true
		   // step 2  // j=2<=star(1) false
		 // step1   j=1<=star(1) true
		      
		   for (int j=1;j<=star;j++) // inner loop ---> coloums
	     
		   { 
		   System.out.print("*");  // step 1 print *  
		                           // step 3 print *, step 4 print * 
	                             //  step 6 print * , step 7 print * , step 8 print *
		     
		   
		   }
	    
		   System.out.println(); //step2 false so go to next line
		                         // step 5 false so go to next line
		   
		                        // step 9 false so go to next line
		   
	      star++; // step 3 star (2) star increments is 2
	              // step 6 star (3) star is incremented by 3
	   }
	
	   
	}
   }
