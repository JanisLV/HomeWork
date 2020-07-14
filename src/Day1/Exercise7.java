package Day1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter your " + i + "th" + " number");
            int number = scanner.nextInt();
            summ = summ + number;
            System.out.println("Your summ of numbers is " + summ);
        }
    }
}
