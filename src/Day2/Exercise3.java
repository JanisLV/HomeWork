package Day2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text!");
        String text = scanner.nextLine();
        String firstPartOfText = text.substring(0, text.length()/2);
        String secondPartOfText = text.substring(text.length()/2);
        String finalText = secondPartOfText + firstPartOfText;
        System.out.println(firstPartOfText);
        System.out.println(secondPartOfText);
        System.out.println(finalText);
    }
}
