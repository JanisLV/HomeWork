package Day2;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number, please!");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number, please!");
        int secondNumber = scanner.nextInt();

        for (int i=1; i<=secondNumber; i++) {
            System.out.println();
            for (int n = 1; n <= firstNumber; n++) {
                System.out.print("+  ");
            }
        }
    }
}
