package AccessSpecifiers2;

import AccessSpecifiers.Sample21;

// sub class

public class Sample23 extends Sample21

{

	public static void main (String[] args) 
    
	   {
		
	        // * --->(it shows error)--> Sample21 s21=new Sample21 (); // creat an object from diff package AccessSpecifiers
	        // *--->(it shows error) --> s21.printSqureOfNum(); // call method from diff package AccessSpecifiers           // 1600
	       // * ---> (it shows error) --->  System.out.println(s21.d); // d variable print from diff package AccessSpecifiers  // 40
	   
	   
		Sample23 s23=new Sample23 (); // creat an object 
        s23.printSqureOfNum(); // call method            // 1600
        System.out.println(s23.d); // d variable print    // 40
	   
	   
	   
	   }

}
