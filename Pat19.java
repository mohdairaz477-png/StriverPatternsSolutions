class Pat19{
    public static void main(String args []){
        int n=5;
    //     for(int i=1;i<=n;i++){
    //         for(int j=n;j>=i;j--){
    //             System.out.print("*");
    //         }
    //         for(int j=2;j<=i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=2;j<=i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=n;j>=i;j--){
    //             System.out.print("*");
    //         }
          
    //         System.out.println();
    //     }
    //     for(int i=n;i>=1;i--){
    //         for(int j=i;j<=n;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=i;j>=2;j--){
    //             System.out.print(" ");
    //         }
    //         for(int j=i;j>=2;j--){
    //             System.out.print(" ");
    //         }
    //         for(int j=i;j<=n;j++){
    //             System.out.print("*");
    //         }
          
    //         System.out.println();
    //     }
    int spaces=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            spaces+=2;
            System.out.println();
        }
        int space=2*n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
     }

}