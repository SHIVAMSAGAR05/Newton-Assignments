import java.io.*; // for handling input/output
import java.util.*; // contains Collections framew
					  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
    static double pow(double X, int N) {
        if(N==0) {
            return 1;
        }else if(N>0) {
            return X*pow(X,N-1);
        }else if(N<0) {
            return(1/X)*pow(X,N+1);
        }else {
            return 0;
        }
    }
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for(int i=0;i<test;i++) {
            double X = scan.nextDouble();
            int N = scan.nextInt();
            System.out.printf("%.2f", pow(X, N));
            System.out.println();
        }
	}

}