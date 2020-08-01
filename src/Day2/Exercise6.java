package Day2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number. please!");
        int max = scanner.nextInt();
        for (int i=2; i<=10; i++){
            System.out.println("Enter your "+ i +"th number, please!");
            int number = scanner.nextInt();
            if (number>max) {
                max = number;
            }
        }
        System.out.println("Bigest number is: " + max);
    }
}
