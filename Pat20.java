
class Pat20 {

    public static void main(String[] args) {
        int n = 5;
        int spaces = 8;
        int spaces2=2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            spaces=spaces-2;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
    }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int k=1;k<=spaces2;k++){
                System.out.print(" ");
            }
            spaces2=spaces2+2;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
