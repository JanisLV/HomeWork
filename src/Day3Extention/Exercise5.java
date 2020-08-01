package Day3Extention;

import java.util.Arrays;

public class Exercise5 {
    // Funkcija atgriež masīvu, kas satur pirmos N naturālos skaitļus
    public static int[] firstNaturalNumbers(int n) {
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        return numbers;
    }

    // Uzrakstiet funkciju, kas atgriež masīvu ar visiem pozitīviem pāra skaitļiem no 2 līdz N
//    public static int[] firstEvenNumbers(int n) {
//    }

    public static void main(String[] args) {

        int[] numbers = firstNaturalNumbers(5);
        System.out.println(Arrays.toString(numbers));   // Izvadīs [1, 2, 3, 4, 5]

        numbers = firstNaturalNumbers(12);
        System.out.println(Arrays.toString(numbers));   // Izvadīs [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

//        numbers = firstEvenNumbers(5);
//        System.out.println(Arrays.toString(numbers)); // Jāizvada [2, 4]

//        numbers = firstEvenNumbers(12);
//        System.out.println(Arrays.toString(numbers)); // Jāizvada [2, 4, 6, 8, 10, 12]

    }
}
