package firstclass;
import java.util.Scanner ;
public class ComputerScienceSkills {
    public static void main (String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.print("Please Enter Your Skill Set (JAVA/SQL/CLOUD) ");
        String userInput = myScan.next();
        if (userInput.equalsIgnoreCase("JAVA")) {
            System.out.println("What is your JAVA score? :");
            int javaScore = myScan.nextInt();
        }
        else if (userInput.equalsIgnoreCase("SQL")) {
            System.out.println("What is your Hackerrank score? :");
            int hackerrankScore = myScan.nextInt();
        }
        else if (userInput.equalsIgnoreCase("Cloud")) {
            System.out.println("Do you have a certificate?(Y/N) ");
            String inputCertificate = myScan.next();

        }
        else {
            System.out.println("Only JAVA/SQL/CLOUD");
        }
    }
}
