package firstclass;

public class BuildATriangle {
    public static void main(String[] args) {
      char star = '*';
        for (int i = 0; i<17 ; i++) {
            for (int j = 0 ; j <= i ; j++){
                System.out.print("*  ");
            }
            System.out.println();
            System.out.print((int)star);
        }
    }
}
