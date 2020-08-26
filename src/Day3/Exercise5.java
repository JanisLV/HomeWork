package Day3;

import java.util.Arrays;

public class Exercise5 {
    // Uzrakstiet funkciju, kas saņem divus veselo skaitļu masīvus
    // un apvieno tos vienā masīvā (sākumā visi pirmā masīva elementi, pēc tām visi otrā masīva elementi)
    public static void concatinateArrays(int[] array1, int[] array2){
        int array1Len = array1.length;
        int array2Len = array2.length;
        int[] result = new int[array1Len + array2Len];

        System.arraycopy(array1,0, result,0,array1Len);
        System.arraycopy(array2, 0,result,array1Len,array2Len);
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int[] aaa = {1,45,6,78,2};
        int[] bbb = {43,65,4,33};

        concatinateArrays(aaa,bbb);
    }
}
