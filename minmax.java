import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public int max(int []myNumber)
	{
		int max=0;
		for(int i=0;i<myNumber.length;i++)
		{
			if(myNumber[i]>max)
			{
				max=myNumber[i];
			}
		}
		return max;
	}
	public int min(int []myNumber)
	{
		int min=myNumber[0];
		for(int i=0;i<myNumber.length;i++)
		{
			if(myNumber[i]<max)
			{
				min=myNumber[i];
			}
		}
		return min;
	}
	
	public static void main (String[] args) {
       int arry[] = {10, 11, 25, 41, 3}; 
        int arr_size = 5; 
		Main m1=new Main();
		System.out.println("Max value:"+m1.max(arry));
        System.out.println("Min value:"+m1.min(arry));

        }
}


