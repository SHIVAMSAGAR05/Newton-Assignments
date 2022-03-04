import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
                      // Your code here
                      class Main {
	static void towerOfhanoi(int N,char src,char dest,char temp){
		if (N==0)
	
			return;
		
		towerOfhanoi(N-1,src,temp,dest);
		System.out.println(N+":"+src+"->"+dest  );
		towerOfhanoi(N-1,temp,dest,src);
	}
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);

                      int N=sc.nextInt();
					  towerOfhanoi(N,'A','C','B');

	}
}