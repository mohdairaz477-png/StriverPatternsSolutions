class Pat14{
    public static void main(String[] args) {
        int n=5;
       
        char letter;
        for(int i=65;i<65+n;i++){
            for(int j=65;j<=i;j++){
                // int a=65;
                // letter=(char) a;
                // a=a+j;
                letter=(char) j;
                System.out.print(letter+" ");
                
            }
            System.out.println();
        }
    }
}