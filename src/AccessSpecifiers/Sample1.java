package AccessSpecifiers;

public class Sample1 
{

 int a;
 
 Sample1()

 {
	 a=10;
 }

 public void printSquareOfNumber()
 
 {
	 
	 System.out.println(a*a);
 }

 public static void main(String[] arg)
 {
	 Sample1 s1 = new Sample1();
	 System.out.println(s1.a);
 }

}
