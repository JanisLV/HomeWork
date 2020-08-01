package Day2Extention;

import java.util.Scanner;

public class Exercise2 {
    // Uzrakstiet programmu, kas prasa lietotājam ievadīt vienu teksta rindiņu
    // un saskaita cik tajā ir lielo un mazo burtu
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
