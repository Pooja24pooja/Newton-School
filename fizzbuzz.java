static void fizzbuzz (int N){
    for(int i=1;i<=N;i++){
        if(i%3==0 && i%5==0)
            System.out.print("FizzBuzz ");
        else if(i%3==0)
           System.out.print("Fizz ");
        else if(i%5==0)
            System.out.print("Buzz "); 
        else
            System.out.print(i+" ");
    }
}