static void SumAndMean(int arr[],int N){
  //Enter your code here 
  Scanner scan=new Scanner(System.in);
  int Sum=0, Mean=0;
  for(int i=0;i<N;i++){
    Sum=Sum+arr[i];
  }
  Mean=Sum/N;
  System.out.print(Sum);
  System.out.print(' ');
  System.out.print(Mean);
    }