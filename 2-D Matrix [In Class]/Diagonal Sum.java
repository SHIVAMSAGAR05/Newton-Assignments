import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					   Scanner scan=new Scanner(System.in);
					   int n=scan.nextInt();
					  int arr[][]=new int[n][n];
					  for(int i=0;i<n;i++){
						  for(int j=0;j<n;j++){
							  arr[i][j]=scan.nextInt();

						  }
					  }
					  int sum1=0,sumr=0;
					  for(int i=0;i<n;i++){
						  for(int j=0;j<n;j++){
							  if(i==j)
							  sum1+=arr[i][j];
							  if(i+j==n-1)
							  sumr+=arr[i][j];

						  }
					  }
					  System.out.print(sum1+" ");
					  System.out.print(sumr);
	}
}