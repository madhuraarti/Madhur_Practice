package Array;

public class Sample5 
{


   public static void main(String[] args)
	
	{   
		// Step1: array declaration
		String ar[] =new String[5];
		
		// Step2: array initialization
		ar[0]="rahul";
		ar[1]="madhur";
		ar[2]="ganesh";
		ar[3]="suresh";
		ar[4]="Mahesh";
		
		// step3: array usage
		System.out.println(ar[3]);  // suresh
		System.out.println(ar[0]);	// rahul
		
		System.out.println(" ------print all info from string array--------------------");
		
		    
		      			
			  // step5   4=4        <-----4                   print mahesh
		     // step4    3<4        <----3                    print suresh
		    // Step3    2<4         <---2   print ganesh
		   // Step2    1<4     <-- 1          print madhur
	 //   Step1  0   0<4                      Print rahul               
		for(int i=0; i<=4;      i++)   // 0 to 4
		{
			System.out.println(ar[i]);
			           //        0 = rahul
			           //        1= madhur
			          //         2= ganesh
			          //         3= suresh
			         //          4= Mahesh
		}
		
		
	}





}
