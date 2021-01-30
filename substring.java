import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String A = inputScanner.nextLine();
        String B = inputScanner.nextLine();

        if(B.contains(A))
            System.out.println("Yes");
        else
            System.out.println("No");

	}
}