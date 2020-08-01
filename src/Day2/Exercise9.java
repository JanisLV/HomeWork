package Day2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (int i =1; i<=10; i++){
            System.out.println("Enter your "+i+ "th number, please!");
            int number = scanner.nextInt();
            if (number%2==0){
                counter = counter +1;
            }
        }
        System.out.println("Even numbers amout is: " +counter);
    }
}
