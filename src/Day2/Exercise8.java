package Day2;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first text string, please!");
        String text = scanner.nextLine();
        String longestString = text;
        String shortestString = longestString;
        for (int i=2; i<=10; i++){
            System.out.println("Enter your "+i+ "th text string, please!");
            String nextText = scanner.nextLine();
            if (nextText.length()>longestString.length()){
                longestString = nextText;
            }
            if (nextText.length()<shortestString.length()) {
                shortestString = nextText;
            }
        }
        System.out.println("Longest string is: " + longestString + ". The string has got "+ longestString.length() + " characters");
        System.out.println("Shortest string is: " + shortestString + ". The string has got " + shortestString.length() + " characters");
    }
}
