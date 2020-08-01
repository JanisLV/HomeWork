package Day3Extention;

public class Exercise8 {
    // Uzrakstiet funkciju, pārbauda vai divi veselo skaitļu masīvi ir vienādi
    // Vienādi masīvi ir tad, ja:
    // 1. tiem ir vienāds elementu skaits
    // 2. elementi vienādās pozīcijās ir vienādi (1. no viena ir vienāds ar 1. no otrā, 2. no pirmā ir vienāds ar 2. no otrā utt)
//    public static boolean arraysAreEqual(int[] a1, int[] a2) {
//    }

    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, 3, 4, 5};
        int[] numbers2 = new int[]{6, 7, 8};

//        System.out.println(arraysAreEqual(numbers1, numbers2)); // Jāizvada false

        numbers1 = new int[]{67, 78, 89};
        numbers2 = new int[]{67, 78, 89};
//        System.out.println(arraysAreEqual(numbers1, numbers2)); // Jāizvada true

        numbers1 = new int[]{1, 2, 3, 4, 5};
        numbers2 = new int[]{1, 2, 3, 4};
//        System.out.println(arraysAreEqual(numbers1, numbers2)); // Jāizvada false
    }
}
