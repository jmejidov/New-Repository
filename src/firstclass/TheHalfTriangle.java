package firstclass;

public class TheHalfTriangle {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  -");
            }

            for (int k = 9; k >= i - 1; k--) {
                System.out.print("  +");
            }
            System.out.println();
        }
    }
}