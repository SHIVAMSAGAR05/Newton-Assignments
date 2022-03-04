import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                      Scanner scan=new Scanner(System.in);
                      int n=scan.nextInt();

                      String[] arr=new String[n];

                      int minLength=Integer.MAX_VALUE;
                      for(int i=0;i<n;i++){
                          arr[i]=scan.next();
                          minLength=Math.min(arr[i].length(),minLength);
                      }

                      
                      String ans ="";
                      boolean flag= false;
                      for(int i=0;i<minLength;i++){
                          for(int j=0;j<n;j++){
                              if(arr[j].charAt(i) !=arr[0].charAt(i)){
                                flag=true;
                                break;
                              }
                              
                          }
                          if(flag==false)
                          ans=ans+arr[0].charAt(i);

                      }
      if(ans.length() ==0)
        System.out.println(-1);
     else
     System.out.println(ans);

	}
}