class Pat17{
    public static void main(String args []){
        int n=4;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            //left triangle
            for(int j=1;j<=i;j++){
                int a=64;
                a=a+j;
                char ch=(char)a;
                System.out.print(ch);
            }
            //right triangle
            for(int j=2;j<=i;j++){
                int a=64;
                a=a+j;
                char ch=(char)a;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}