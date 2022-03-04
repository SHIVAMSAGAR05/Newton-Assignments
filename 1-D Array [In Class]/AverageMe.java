import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];


        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
         
        System.out.println(heightOfArray(n, arr));
	}

    public static long heightOfArray(int n, int arr[] ){
        long count = 0;
        for(int i = 0; i<n; i++){
            count += arr[i];
        }
        return count / n;
    }
}