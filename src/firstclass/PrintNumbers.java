package firstclass;

public class PrintNumbers {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        firstNumber = 1;
        while (firstNumber <10 ){
            secondNumber = 0;
            while(secondNumber < 10 ){
                thirdNumber = 0 ;
                while(thirdNumber<10){
                    System.out.println(firstNumber+" "+secondNumber+" "+thirdNumber);
                    thirdNumber++;
                }
                secondNumber++;
            }
            firstNumber++;
        }
    }
}
