package Day2Extention;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    // Uzrakstiet programmu, kas:
    // 1. Prasa lietotājam ievadīt 10 veselus skaitļus pēc kārtas;
    // 2. Saglabā skaitļus masīvā
    // 3. Samainā vietām 1. ar 2., 3. ar 4., 5. ar 6. utt
    // 4. Izdrukā masīva saturu uz ekrāna
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array [] = new int[10];
        int newArray [] = new int[array.length];

        for (int i=0; i<10; i++){
            System.out.println("Enter your " + (i+1) + "th number please!");
            array [i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for (int i=1; i<=array.length; i++) {
            if (i % 2 == 0) {
                newArray[i - 1] = array[i-2];
            } else newArray[i-1] = array[i];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
