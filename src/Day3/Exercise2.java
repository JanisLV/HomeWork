package Day3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text, please!");
        String s = scanner.nextLine();
        int bigLetter = 0;
        int smallLetter = 0;

        for (int i=0; i<s.length(); i++){
            if (Character.isUpperCase(s.charAt(i))) bigLetter++;
            if (Character.isLowerCase(s.charAt(i))) smallLetter++;
        }
        System.out.println(bigLetter);
        System.out.println(smallLetter);
    }

}
