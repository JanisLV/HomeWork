package Day2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number. please!");
        int max = scanner.nextInt();
        int min = max;
        for (int i=2; i<=5; i++){
            System.out.println("Enter your "+ i +"th number, please!");
            int number = scanner.nextInt();
            if (number>max) {
                max = number;
            }
            if (number<min) {
                min = number;
            }
        }
        System.out.println("Bigest number is: " + max);
        System.out.println("Smallest number is: " + min);
    }
}
