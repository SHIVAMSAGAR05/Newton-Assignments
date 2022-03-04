import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner scan=new Scanner(System.in);
	int row=scan.nextInt();
	int col=scan.nextInt();
				
	int M[]=new int[col];
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			M[j]=M[j]+scan.nextInt();
			 }
		  }
	int max=M[0];
	for(int i=0;i<col;i++){
		if(M[i]>max){
		max=M[i];

	 }
  }
 System.out.println(max);
}
}