import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = inputScanner.nextInt();
			}
		}

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}