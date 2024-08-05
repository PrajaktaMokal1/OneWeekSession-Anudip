package AnudipPracticals;
import java.util.Scanner;

public class Subtraction {
	
	public static double subtractNumbers(double num1, double num2) {
        return num1 - num2;
	}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double difference = subtractNumbers(num1, num2);

        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);

        scanner.close();
    }

}


