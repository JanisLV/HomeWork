package Day1;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your number, please ");
        int number = scanner.nextInt();
        int factorial = 1;

        for (int i = 2; i<=number; i++){
            factorial = factorial*i;
        }
        System.out.println(number + " factorisl is " + factorial);
    }
}
