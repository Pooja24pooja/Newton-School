import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
		String str = inputScanner.nextLine();

		if(str.contains(" ")){
			System.out.print("Yes");
		}
		else
		System.out.print("No");
	}
}