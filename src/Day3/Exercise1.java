package Day3;

import java.util.Scanner;

public class Exercise1 {
    // Uzrakstiet programmu, kas:
    // 1. Prasa lietotājam ievadīt veselus skaitļus, kamēr netiek ievadīta nulle (0)
    // 2. Izdrukā cik pavisam skaitļi tika ievadīti (NEIESKAITOT PĒDĒJO NULLI)
    // 3. Izdrukā ievadīto skaitļu summu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int numbersCounter = 0;
        int sumOfNumbers =0;

        do {
            System.out.println("Enter your number, please!");
            number = scanner.nextInt();
            numbersCounter++;
            sumOfNumbers=sumOfNumbers+number;
        } while (number!=0);

        System.out.println("You enter " + (numbersCounter - 1) + " numbers");
        System.out.println("Sum of yours numbers is: " + sumOfNumbers);
    }
}
