package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    // Uzrakstiet funkciju kas pārbauda vai divi padotie veselo skaitļu masīvi ir vienādi.
    // 1. Funkcijai ir jāatgriež boolean tipa vērtība
    // 2. Masīvi ir vienādi ja:
    //    - tiem ir vienāds elementu skaits
    //    - elementi vienādās pozīcijās ir vienādi (0-tais ar 0-to, 1-ais ar 1-mo utt)
    public static void compareArrays(int[] array1, int[] array2) {
        if (Arrays.equals(array1,array2)){
            System.out.println("The arrays are equals.");
        } else {
            System.out.println("The arrays are not equals.");
        }


    }
    public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your first array size: ");
            int firstArrayLenght = scanner.nextInt();
            int[] firstArray = new int[firstArrayLenght];
            for (int i = 0; i < firstArrayLenght; i++) {
                System.out.print("Enter your number: ");
                firstArray[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(firstArray));

            System.out.println("Enter your second array size: ");
            int secondArrayLenght = scanner.nextInt();
            int[] secondArray = new int[secondArrayLenght];
            for (int i = 0; i < secondArrayLenght; i++) {
                System.out.print("Enter your number: ");
                secondArray[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(secondArray));

            compareArrays(firstArray, secondArray);
    }
}