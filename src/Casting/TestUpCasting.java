package Casting;

public class TestUpCasting 
{

	public static void main(String[] args) 
    {
		//public static void main(String[] args) 
	     //{
			//Son s=new Son();
			//s.bike();
			//s.car();
			//s.money();
			//s.home();
		
    
    
    // creat an object of sub class with reference of super class
    
		Father s1 =new Son1();
		s1.car();
		s1.money();
		s1.home();
		// s1.bike(); son1 didnt give to bike because it is son property
    
    
    }
	 




}



