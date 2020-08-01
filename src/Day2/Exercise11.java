package Day2;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text, please!");
        String text = scanner.nextLine();
        int letterCounter = 0;
        int position =0;
        char firstLetter = text.charAt(0);
       for (int i=1; i<=text.length(); i++){
           if (text.charAt(position) == firstLetter){
               letterCounter = letterCounter +1;
           }
           position++;
       }
       System.out.println("In your text letter '" +firstLetter+ "' is " + letterCounter);

    }
}
