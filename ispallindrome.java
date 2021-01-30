import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String val = inputScanner.nextLine();
        int strLength = val.length();
        int i = 0;
        int j = strLength-1;
        while(i<j){
            if(val.charAt(i)!=val.charAt(j)){
                System.out.println("0");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("1");	}
}