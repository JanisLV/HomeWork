package Day3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    // Uzrakstiet programmu, kas:
    // 1. Prasa lietotājam ievadīt 10 veselus skaitļus pēc kārtas
    // 2. Saglabā skaitļus masīvā
    // 3. Pārbauda vai ievadītie skaitļi ir sakārtoti augošā secībā un izvada atbilstošo paziņojumu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[10];

        for (int i = 0; i <= 9; i++) {
            System.out.print("Enter your " + (i+1) + "'th number, please! ");
            numbers[i] = scanner.nextInt();
        }
        boolean order = true;
        for (int i=0;i<=8; i++){
            if (numbers[i] > numbers[i+1]) order = false;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        if (order){
            System.out.println("Arraiy is ordered ascending");
        } else {
            System.out.println("Arraiy is not ordered ascending");
        }
    }
}
