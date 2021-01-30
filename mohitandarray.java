import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int grandSum = (N*(N+1))/2;
		int sum = 0;
		for(int i=0;i<N-1;i++){
			sum+=scanner.nextInt();
		}
		System.out.println(grandSum-sum);
	}
}