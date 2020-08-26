package Day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise4 {
    // Uzrakstiet funkciju, kas apgriež veselo skaitļu masīvu.
    // Funcijai NEDRĪKST mainīt padoto masīvu.
    // Funkcijai ir jāuzbūvē jauns masīvs un jāatgriež tas kā funkcijas vērtību.
    public static int[] turnOverArray(int[] array){
        int[] array1 = new int[array.length];

        for (int i=0; i<=array.length-1; i++){
            array1[i] = array[array.length-1-i];
        }
        return array1;
    }
    public static void main(String[] args) {
        int[] aaa = {1,54,38,65,97,44};
        int[] bbb = {54,3,22,645,21221};
        System.out.println(Arrays.toString(aaa));
        System.out.println(Arrays.toString(turnOverArray(aaa)));
        System.out.println(Arrays.toString(bbb));
        System.out.println(Arrays.toString(turnOverArray(bbb)));
    }
}
