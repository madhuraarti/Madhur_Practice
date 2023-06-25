package StarPattern;

public class Pattern8 
{
   public static void main(String[] args)
	
	{   
		   // *********
		    //*******
        	//*****  
		    //***
	      //  *
	   int star =9;      // for star print (*)
	  
	   
	   for( int i=1; i<=5;i++)  // outer loop ---> rows
		
	   {  
		 
		   for (int j=1;j<=star;j++) // inner loop ---> coloums
	     
		   { 
		   System.out.print("*");  
		   	   
		   
		   }
	    
		   System.out.println(); 
		   
	      star=star-2; 
	   }
	
	    
	}
   }
