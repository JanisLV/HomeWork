package Day2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text, please!");
        String text = scanner.nextLine();
        String firstLetter = text.substring(0,1);
        String secondPartOfText = text.substring(1);
        System.out.println(firstLetter);
        System.out.println(secondPartOfText);
        System.out.println(firstLetter.toUpperCase() + secondPartOfText.toLowerCase());
    }

}
