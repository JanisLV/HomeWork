package Day3Extention;

import java.util.Arrays;

public class Exercise7 {
    // Uzrakstiet funkciju, kas apvieno divus veselo skaitļu masīvus vienā
    public static int[] joinArrays(int[] a1, int[] a2) {
        int array1Len = a1.length;
        int array2Len = a2.length;
        int[] result = new int[array1Len + array2Len];
        System.arraycopy(a1,0, result,0,array1Len);
        System.arraycopy(a2, 0,result,array1Len,array2Len);
        return result;
    }

    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, 3, 4, 5};
        int[] numbers2 = new int[]{6, 7, 8};

        int[] joined = joinArrays(numbers1, numbers2);
        System.out.println(Arrays.toString(joined));    // Jāizvada [1, 2, 3, 4, 5, 6, 7, 8]

        numbers1 = new int[]{100, 56};
        numbers2 = new int[]{66, 77, 88, 99};

        joined = joinArrays(numbers1, numbers2);
        System.out.println(Arrays.toString(joined));    // Jāizvada [100, 56, 66, 77, 88, 99]
    }
}
