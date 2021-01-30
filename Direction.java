Weekend Contest 2 - DSA - Direction (Contest)



Alice wants to go to Bob's house. The location of their houses is given on a 2-D coordinate system. There are a total of 8 directions:
North - Directly above
South - Directly below
East - To the right
West - To the left
North East - In between north and east
North West - In between north and west
South East - In between south and east
South West - In between south and west
Find the direction in which Alice must go to reach Bob's house.
Input
There are two lines of input. The first line contains the x and y coordinate of Alice's house. The second line contains x and y coordinate of Bob's house. It is given that these two locations are different.

-100 <= Coordinates <= 100
Output
Print a single string denoting the direction in which Alice must move to reach Bob's house.




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc = new Scanner(System.in);
                      long firstx = sc.nextLong();
                      long firsty = sc.nextLong();
					  long secondx = sc.nextLong();
					  long secondy = sc.nextLong();
					  if( firstx<secondx && firsty<secondy){
						  System.out.print("North East");
					  }
					  else if( firstx>secondx && firsty>secondy){
						  System.out.print("South West");
					  }
                      else if( firstx>secondx && firsty<secondy){
						  System.out.print("North West");
					  }
					  else if( firstx<secondx && firsty>secondy){
						  System.out.print("South East");
					  }
					  else if( firstx==secondx && firsty<secondy){
						  System.out.print("North");
					  }
					  else if( firstx==secondx && firsty>secondy){
						  System.out.print("South");
					  }
					  else if( firstx<secondx && firsty==secondy){
						  System.out.print("East");
					  }
					  else{
						  System.out.print("West");
					  }

	}
}