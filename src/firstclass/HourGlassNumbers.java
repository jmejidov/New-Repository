package firstclass;

public class HourGlassNumbers {
    public static void main(String[] args) {
        for (int i = 1 ; i < 11 ; i++){
            // to print spaces
            for (int j = 1 ; j<=i ; j++){
                System.out.print("-");
            }
            // to print numbers triangle
            for (int k = i ; k < 11 ; k ++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
