package Day2Extention;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    // Uzrakstiet programmu, kas:
    // 1. Prasa lietotājam ievadīt vienu pozitīvo veselu skaltli N
    // 2. Izveido int tipa masīvu ar garumu N
    // 3. Aizpilda masīvu ar NEJAUŠI IZVĒLĒTAJIEM SKAITĻIEM no 0 līdz 999
    // 4. Izdrukā masīva saturu uz ekrānā (vienā rindā!!!)
    // 5. Nosaka masīva maksimālo un minimālo elementus, izvada tos uz ekrāna.
    //
    // Lai uzģenerēto nejaušo skaitli no 0 līdz 999 ir jāizmanto šāda konstrukcija:
    // int randomNumber = Math.round(Math.random() * 1000);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number please!");
        int arrayLengh = scanner.nextInt();
        int numbers [] = new int[arrayLengh];

        for (int i=0; i<arrayLengh; i++){
            numbers[i] = (int) Math.round(Math.random()*1000);
        }
        System.out.println(Arrays.toString(numbers));

        int max = 0;
        for (int i =0; i<=arrayLengh-1; i++) {
            if (max < numbers[i])
                max = numbers[i];
        }
        System.out.println("Max number is: " + max);

        int min = numbers[0];
        for (int i = 0; i <= arrayLengh-1; i++) {
            if (min > numbers[i])
                min = numbers[i];
        }
        System.out.println("Min number is: " + min);
    }
}
