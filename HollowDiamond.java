public class HollowDiamond {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 2; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j <= 2*i-1; j++) {
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 9-2*i; j++) {
                if(j==1||j==9-2*i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
