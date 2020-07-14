package Day2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your text!");
        String text=scanner.nextLine();
        String first=text.substring(0,2);
        String second=text.substring(3,text.length());
        System.out.println(first+'?'+second);
    }
}
