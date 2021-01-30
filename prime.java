import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
		int no=scan.nextInt();
		for(int i=2;i<=Math.sqrt(no);i++)
		{
			boolean var=false;
			{
				if(no%i==0)
				{
				var=true;
				}
			}
			if(var!=true)
			{
					System.out.println("Yes");
			}
			else
			{
					System.out.println("No");
			}
		}   
		if(i<2)
		{

		}     
				}
}