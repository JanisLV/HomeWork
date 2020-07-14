package Day1;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        double divisor = 1;

        for (int i=1; i<=100000; i++){
            result = result + 1/divisor - 1/(divisor + 2);
            divisor = divisor + 4;
        }
        System.out.println(result*4);

    }
}
