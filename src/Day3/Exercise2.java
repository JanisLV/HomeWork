package Day3;

import java.util.Scanner;

public class Exercise2 {
    // Uzrakstiet programmu, kas izvada uz ekrāna Fibonači skaitļus no 1 līdz N
    // 1. N ir lietotāja ievadīts skaitlis
    // 2. Fibonači skaitļi ir 1 1 2 3 5 8 13 21 34 55 ...
    //    Pirmie divi vienmēr ir 1
    //    Katrs nākošais ir divu iepriekšējo skaitļu summa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number, please!");
        int n = scanner.nextInt();
        int firstNumber = 1;
        int secondNumber = 1;
        int nextNumber = 0;
        System.out.print(firstNumber + " " + secondNumber + " ");

        for (int i=3; i<=n;i++){
            nextNumber = firstNumber+secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber=secondNumber;
            secondNumber=nextNumber;

        }
        System.out.println("Fibonachi number of '" + n + "' is: " + nextNumber);

    }
}
