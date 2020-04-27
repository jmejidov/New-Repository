package firstclass;

public class TheAbcLoopWithWhile {
    public static void main(String[] args) {
        int number = 1;
        int count ;
        char letters = 'a';
        while (number<6){
            count = 0;
            System.out.print(number);
            while (count < 4 ){
                System.out.print("\t"+letters);
                letters++;
                count++;
            }
            System.out.println();
            number++;
        }
    }
}
