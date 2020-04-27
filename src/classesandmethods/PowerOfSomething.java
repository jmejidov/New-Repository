package classesandmethods;
import java.util.Scanner;
public class PowerOfSomething {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number : ");
        int base = scanner.nextInt();
        System.out.print("Enter power number : ");
        int power = scanner.nextInt();

        System.out.println(Math.pow(base,power));

    }

}
