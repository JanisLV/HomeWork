package Day2Extention;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    // Uzrakstiet programmu, kas prasa lietotājam ievadīt 10 veselus skaitļus pēc kārtas
    // un izdrukā tos uz ekrāna apgrieztā secībā.
    //
    // Padoms:
    // Sākumā saglabājiet skaitļus masīvē un pēc tām apstaigājiet masīvu no pēdēja element uz pirmo,
    // izvadot visu uz ekrāna.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array [] = new int[10];
        int newArray [] = new int[array.length];

        for (int i=0; i<10; i++){
            System.out.println("Enter your " + (i+1) + "th number please!");
            array [i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for (int i=0; i<array.length; i++){
            newArray[array.length-1-i] = array[i];

        }
        System.out.println(Arrays.toString(newArray));
    }
}
