package Day2;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text string, please!");
        String text = scanner.nextLine();
        int counter = 0;
        int position = 0;
        for (int i=1; i<=text.length();i++){
            if (text.charAt(position) == 'a' || text.charAt(position) == 'A'){
                counter = counter +1;
            }
            position = position +1;
        }
        System.out.println(counter);
    }
}
