package StringClass;

public class Sample1 
{

      public static void main(String[] args)
      {
	       String s1;  // declaration of variable
	       
	       String s2="abc";   // variable declaration & initialization
	       
	       // String object are immutable in nature
	       
	       String s5="ab";
	       
	       s5=s5+"cd";   // ab + cd = abcd
	       
	       s5=s5+"xyz";  // abcd +xyz = abcdxyz // new information is stored
	       
	       System.out.println(s5);
      }

}
