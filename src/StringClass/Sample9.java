package StringClass;

public class Sample9 
{

        public static void main(String[] args) 
        
        {
	
            // charAt is just opposite to indexOf
        	
        	String s1="abcabcab";                   // 0 to 7
        	        // 01234567 
        	System.out.println(s1.indexOf('c'));   // 2  // first occurance // return type
        	
        	System.out.println("--------------");
        	
        	String s2="abcabcab";                 // 0 to 7
	                // 01234567 
	        System.out.println(s2.indexOf('a'));  // 0  // first occurance // return type
        
            System.out.println("--------------");
        	
        	String s3="abcabcaf";  // 0 to 7
	                // 01234567 
	        System.out.println(s3.indexOf('f')); // 7  // first occurance // return type
	        
	        System.out.println("--------------");
	        
	        String s4="abcabcab";  // 0 to 7
                    // 01234567 
            System.out.println(s4.lastIndexOf('a')); // 6  // last occurance // return type
            
            System.out.println("--------------");
	        
	        String s5="abcabcab";  // 0 to 7
                    // 01234567 
            System.out.println(s5.lastIndexOf('c')); // 5  // last occurance // return type
        
            System.out.println("--------------");
            
            String s6="abcabcab";                 // 0 to 7
            // 01234567 
            System.out.println(s6.indexOf('a')); 
        
        }



}
