package AccessSpecifiers;

public class Sample2

// Example1: of private access specifier


{

	private int a;
	 
	 Sample2()

	 {
		 a=10;
	 }

	 public void printSquareOfNumber()
	 
	 {
		 
		 System.out.println(a*a);
	 }

	 public static void main(String[] arg)
	 {
		 Sample2 s2 = new Sample2();
		 System.out.println(s2.a);
	     s2.printSquareOfNumber();
	 }


}
