package Array;

import java.util.Arrays;

public class exampl4_stringArraySorting 

{

	public static void main(String[] args)
	
	{   
		
		String ar[] =new String[5];
		
		 ar[0]="rahul";
		 ar[1]="ganesh";
		 ar[2]="mahesh";
		 ar[3]="suresh";
		 ar[4]="ramesh";
		
		 Arrays.sort(ar); 
		
		for( int i=0; i<=ar.length-1;i++)
		{
	     System.out.println(ar[i]);
		}
	}
}
