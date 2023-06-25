package LogicalProgram;

public class example5 
{
  public static void main(String[] args) 
  {
	int [] ar1= {10,20,     30,40,                  100};
	int [] ar2= {10,20,     70,80,                  100};
	
	//         same info    diff info             same info
	//                    only diff info print
	
	
	//            step2   1<=4
	//            step1   0<=4
	
	for (int i=0;        i<=4;         i++)
	{	    

		// step5       100! = 100    false not print
		// step4       40!  = 80    true print
		// step3       30!  = 40    true  print
		// step2       20!  = 20    false not print
		// step1       10!  = 10    false not print
		if(ar1[i]!=ar2[i])   // 10!=10 ie != it means not equal to (called false) // 30!=40 != it means not equal to (called true)
		{
			
			  // step4          //   40           80
			 //step3           //   30           40   
			System.out.println(ar1[i]+" "+ar2[i]);
		}
		
	
	
	
	}
  }
}
