package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    // Uzrakstiet divas funkcijas:
    // 1. Pieņem veselo skaitļu masīvu un atgriež masīva maksimālo elementu
    // 2. Pieņem veselo skaitļu masīvu un atgriež masīvs minimālo elementu
    public static void returnMax (int[] array){
        int max = 0;
        for (int i =0; i<=array.length-1; i++){
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Max number is: " + max);
    }
    public static void returnMin (int[] array) {
        int min = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("Min number is: " + min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int arrayLenght = scanner.nextInt();
        int[] array = new int[arrayLenght];
        for (int i=0; i< arrayLenght; i++){
            System.out.print("Enter your number: ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        returnMax(array);
        returnMin(array);
    }
}
