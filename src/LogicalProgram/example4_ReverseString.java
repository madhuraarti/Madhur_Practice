package LogicalProgram;

public class example4_ReverseString 
{
   public static void main(String[] args) 
     
   {
	      String org="abcd";                  // output  = dcba
	      String rev="";
	      
	      
	      //      important
	      
	      for (int i= org.length()-1;   i>=0;    i--)
	      {
	    	  rev=rev+org.charAt(i);   //""
	      }
	      
	     System.out.println(org);   //abcd
	     System.out.println(rev);   //dcba
   }
}
