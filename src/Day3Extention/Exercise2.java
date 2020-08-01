package Day3Extention;

public class Exercise2 {
    // Funkcija "izmet" no teksta rindiņas katru otro simbolu
    public static String removeOddCharacters(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            result = result + c;
        }

        return result;
    }

    // Uzrakstiet funkciju, kas dubulto katru teksta rindiņas simbolu
    public static String duplicateCharacters(String s) {
        String result ="";
        int position = 0;
        for (int i=1;i<=s.length(); i++){
            char letter = s.charAt(position);
            for (int j=1; j<=2; j++){
                result = result +letter;
            }
        position++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeOddCharacters("Hello, World!")); // Izvadīs Hlo ol!
        System.out.println(removeOddCharacters("abcd"));          // Izvadīs ac

        System.out.println(duplicateCharacters("Hello, World!"));  // Jāizvada HHeelllloo,,  WWoorrlldd!!
        System.out.println(duplicateCharacters("abcd"));           // Jāizvada aabbccdd
    }
}
