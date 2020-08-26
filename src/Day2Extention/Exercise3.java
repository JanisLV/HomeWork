package Day2Extention;

import java.util.Scanner;

public class Exercise3 {
    // Uzrakstiet programmu, kas prasa lietotājam ievadīt vienu teksta rindiņu
    // un sadala to divās jaunās rindiņās:
    // 1. rindiņai jāsatur visi oriģinālās rindiņas PĀRA burti (2., 4., 6. utt)
    // 2. rindiņai jāsatur visi oriģinālās rindiņas NEPĀRA burti (1., 3., 5. utt)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yor sentence please!");
        String text = scanner.nextLine();
        StringBuilder builder = new StringBuilder();

        int position = 0;
        String reserved = "";
        for (int i=1; i<=text.length()/2;i++){
            char c = text.charAt(position);
         //   reserved = reserved + c;
         //   position = position + 2;
            builder.append(c);
        }

        System.out.println(builder.toString());

    }
}
