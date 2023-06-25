package StringClass;

public class Sample10 

{

	public static void main(String[] args) 
    
    {

        
    	String s1="my name is abc";                   
    	         
    	System.out.println(s1.startsWith("my"));   // ture
    	
    	System.out.println("--------------");
    	
    	String s2="my name is abc";                   
        
    	System.out.println(s2.startsWith("name"));   // false

        System.out.println("--------------");
    	
    	String s3="my name is abc";                   
        
    	System.out.println(s3.endsWith("abc"));   // ture
    	
        System.out.println("--------------");
    	
    	String s4="my name is madhur";                   
        
    	System.out.println(s4.endsWith("madhur"));   // ture
    	
        System.out.println("--------------");
    	
    	String s5="my name is madhur";                   
        
    	System.out.println(s5.endsWith("is"));   // false
    }
    }
