package Day3;

import java.util.Scanner;

public class Exercise1 {
    // Uzrakstiet programmu, kas prasa lietotājam ievadīt 10 teksta rindiņas pēc kārtas
    // un saskaita cik no ievadītajām rindiņām sākas ar lielo burtu.
    // Padoms: char tipa mainīgo var pārbautīt ar >= (lielāks vienāds) un <= (mazāks vienāds) operatoriem.
    // Visi burti ASCII tabulā ir sakārtoti alfabetiskā kārtībā, tātad pārbaudīt vai simbols ir lielais buts var ar
    // c >= 'A' && c <='Z'
    //
    // Papildus uzdevums: programmai pareizi jāapstrādā tukšas rindiņas (length() == 0).
    // Tā kā tukšai rindiņai nav pirmā burta, šādas rindiņas ir jāignorē (bet programmai nedrīkst beigties ar kļūdu!)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("We ask you enter 10 lines of text, please");

        int startsWithBigLetter = 0;


        for (int n = 1; n <= 2; n++) {
            System.out.println("Enter your " + n + "th text line, please");
            String text = scanner.nextLine();
            char firstLetter = text.charAt(0);
 //           if (text.length()==0){
//                System.out.println("Please reenter your text, you could't left empty text line");
 //           }
            if (firstLetter >= 'A' && firstLetter <= 'Z') {
                startsWithBigLetter++;
            }
        }
        System.out.println(startsWithBigLetter);
    }
}
