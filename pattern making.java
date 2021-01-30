public static void pattern_making(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }

        if(i>1){
            for(int j=i-1;j>0;j--){
                System.out.print(j+" ");
            }
        }
        System.out.println();
    }

    for(int i=n-1;i>0;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }

        if(i>1){
            for(int j=i-1;j>0;j--){
                System.out.print(j+" ");
            }
        }
        System.out.println();
    }
}