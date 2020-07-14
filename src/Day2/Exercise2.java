package Day2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your text!");
        String text=scanner.nextLine();
        String reserved = "";
        int position = text.length()-1;
        System.out.println(text.length());

        for (int i=1; i<=text.length(); i++){
            char c = text.charAt(position);
            reserved = reserved + c;
            position = position - 1;
        }
        System.out.println(reserved);

    }
}
