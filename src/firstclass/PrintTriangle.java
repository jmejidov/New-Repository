package firstclass;

public class PrintTriangle {
    public static void main(String[] args) {
        for (int i = 1 ; i < 10 ; i++ ){
            for ( int j = 1 ; j < 11 - i ; j ++ ){
                System.out.print("- ");
            }
            for ( int k = 0 ; k < (i*2)-1 ; k++ ){
                System.out.print("+ ");

            }
            System.out.println();
        }
    }
}
