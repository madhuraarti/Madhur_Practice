package StringClass;

public class Sample14 
{

    public static void main(String[] args) 
    
    {
            //Split   
    	   	
       String s1="my name is khan";
       
       String[] ar =s1.split(" ");  // "{my(0)  name(1) is(2)  khan(3)"};
       
       System.out.println(ar[2]);
       
       System.out.println(ar.length);
       
       System.out.println("--------------");
       
       for(int i=0;i<=ar.length-1;i++)
       {
    	   System.out.println(ar[i]);
       }
       
       
       
    }


    }
