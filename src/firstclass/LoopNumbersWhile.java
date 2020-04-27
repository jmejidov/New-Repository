package firstclass;

public class LoopNumbersWhile {
    public static void main(String[] args) {
        int number = 1;
        int counter;
        for (int i=1 ; i <= 3 ; i++ ) {
            counter = 1;
            while(counter<6){
                if (number==7 || number==8 || number==9) {
                    System.out.print("" + "\t\t");
                }
                else {
                    System.out.print(number+"\t\t");
                }
                number++;
                counter++;
            }
            System.out.println();
        }
    }
}
