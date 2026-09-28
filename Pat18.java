class Pat18{
    public static void main(String args[]){
        int n=5;
        int a;
        char b;
        for(int i=1;i<=n;i++){
                a=69-(i-1);
            for(int j=1;j<=i;j++){
                b=(char)a;
                System.out.print(b);
                a=a+1;
            }
            System.out.println();
        }
    }
}