package firstclass;

public class TheABCForLoop {
    public static void main(String[] args) {
        int number;
        number = 97;
        for(int i = 1 ; i<=5; i++){
            System.out.print(i);
            for(int j=1;j<=4;j++){
                System.out.print("\t"+(char)number);
                number++;

            }
            System.out.println();


        }
    }
}
