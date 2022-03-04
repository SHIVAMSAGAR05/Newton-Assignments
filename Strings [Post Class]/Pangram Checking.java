import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner scan=new Scanner(System.in);
					  int testcases=scan.nextInt();
					  while(testcases>0){
						  String str=scan.next();
						  int[] arr=new int[26];
						  for(int i=0;i<str.length();i++){
							  char ch=Character.toLowerCase(str.charAt(i));
							  int index=(int)ch-(int)'a';
							  arr[index]=1;

						  }
						  boolean flag=false;
						  for(int i=0;i<26;i++){
							  if(arr[i]==0){
								  System.out.println(0);
								  flag=true;
								  break;

							  }
						  }
						  if(flag==false){
							  System.out.println(1);

						  }
						  testcases--;
					  }
	}
}