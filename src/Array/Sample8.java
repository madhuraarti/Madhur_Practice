package Array;

public class Sample8 
{

public static void main(String[] args)
	
	{   
		// Step1: array declaration
		String ar[] =new String[5];
		
		// Step2: array initialization
		ar[0]="rahul";
		//ar[1]="madhur";
		ar[2]="ganesh";
		//ar[3]="suresh";
		//ar[4]="Mahesh";
		ar[6]="neha";
		
		System.out.println(ar.length); // 5
		// step3: array usage
		System.out.println(ar[3]);  // suresh
		System.out.println(ar[0]);	// rahul
		
		System.out.println("------print all info from string array--------------------");
		
		for( int i=0; i<=ar.length-1;i++)
		{
	     System.out.println(ar[i]);
		}
	}




}
