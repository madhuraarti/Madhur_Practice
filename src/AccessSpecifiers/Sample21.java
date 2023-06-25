package AccessSpecifiers;

public class Sample21 
{
 
	protected int d;
	
	protected Sample21()
	{
		d=40;	
		
	}
  
	protected void printSqureOfNum()
	
	{
		System.out.println(d*d);
	}

   public static void main (String[] args) 
    
   {
	
         Sample21 s21=new Sample21 (); // creat an object
         s21.printSqureOfNum(); // call method             // 1600
         System.out.println(s21.d); // d variable print    // 40
   
   
   }

}
