package Day3Extention;

import java.util.Arrays;

public class Exercise9 {
    // Uzrakstiet funkciju, kas no padotā masīva numbers
    // izmet elementu ar padotu numuru n.
    // Funkcijai ir jāuzbūvē un jāatgriež jauns masīvs,
    // kurā ir par 1 elementu mazāk, nekā padotajā.
    // Funkcijai korekti jāstrādā, ja n ārpus masīva robežām (nedrīkst paradīties kļūdai)
    public static int[] removeElement(int[] numbers, int n) {
        int[] array = new int[numbers.length - 1];
        System.arraycopy(numbers,0,array,0,1);
        System.arraycopy(numbers, 2,array,1, numbers.length-2);

        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] removed = removeElement(numbers, 1);
        System.out.println(Arrays.toString(removed)); // Jāizvada [1, 3, 4, 5]

    }
}
