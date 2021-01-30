import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int sum = 0;
		int num;
		for(int i=0;i<N;i++){
			num = scanner.nextInt();
			if(num%2==1){
				sum+=num;
			}
		}
		System.out.println(sum);
	}
}