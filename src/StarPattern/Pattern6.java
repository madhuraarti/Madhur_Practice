package StarPattern;

public class Pattern6 
{
   public static void main(String[] args)
	
	{   
		   // ****
		    //***
        	//**  
		    //*
	      
	   int star =4;      // for star print (*)
	  
	   
	   for( int i=1; i<=4;i++)  // outer loop ---> rows
		
	   {  
		 
		   for (int j=1;j<=star;j++) // inner loop ---> coloums
	     
		   { 
		   System.out.print("*");  
		   	   
		   
		   }
	    
		   System.out.println(); 
		   
	      star--; 
	   }
	
	    
	}
   }
