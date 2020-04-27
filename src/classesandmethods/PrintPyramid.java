package classesandmethods;

public class PrintPyramid {
    public static void displayPyramid(){
        for (int i = 1 ; i < 10 ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        HorizontalString.horizontal("Hello World");
        displayPyramid();
    }
}
