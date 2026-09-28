class Pat15{
    public static void main(String[] args) {
        int n=5;
        char letter;
        for(int i=64+n;i>=65;i--){
            // we can do a char loop in this 
            //like for(char j='A';j<='A'+i;j++)
            for(int j=65;j<=i;j++){
                letter=(char) j;
                System.out.print(letter+" ");
            }
            System.out.println();
        }
    }
}