package Day2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word!");
        String word = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        int pos = 0;

        for (int i = 1; i<=word.length(); i++){
            char letter = word.charAt(pos);
            for (int a = 1; a<=pos + 1; a++) {
                builder.append(letter);
            }
        pos = pos +1;
        }

        System.out.println(builder.toString());
    }
}
