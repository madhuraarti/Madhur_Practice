package AccessSpecifiers2;

import AccessSpecifiers.Sample11;

public class Sample13

{
 
	public static void main(String[] args)
    {
   	 Sample11 s11=new Sample11(); // we can not access from different package
   	 s11.printCubeOfNum();
   	 System.out.println(s11.b);
    }


}
