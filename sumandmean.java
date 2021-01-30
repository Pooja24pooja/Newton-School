static void SumAndMean(int arr[],int N){
      int sum = 0;
      for(int i=0;i<N;i++){
          sum+=arr[i];
      } 
      System.out.println(sum+" "+(sum/N)); 
    }