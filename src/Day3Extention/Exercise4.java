package Day3Extention;

public class Exercise4 {
    // Funkcija pārbauda, vai teksta rindiņā ir tik pat daudz ciparu, cik burtu
    public static boolean digitsEqualsLetters(String s) {
        int digits = 0;
        int letters = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                digits = digits + 1;
            } else if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                letters = letters + 1;
            }
        }

        return digits == letters;
    }

    // Uzrakstiet funkciju, kas pārbauda, vai teksta rindiņā
    // lielo burtu ir vairāk nekā mazo
    public static boolean moreUpperThanLower(String s) {
        int bigLetter = 0;
        int smallLetter = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                bigLetter = bigLetter + 1;
            } else if (c >= 'a' && c <= 'z') {
                smallLetter = smallLetter + 1;
            }
        }

        return bigLetter > smallLetter;
    }

    public static void main(String[] args) {
        System.out.println(digitsEqualsLetters("abc123"));   // Izvadīs true
        System.out.println(digitsEqualsLetters("A1B1c1"));   // Izvadīs true
        System.out.println(digitsEqualsLetters("abc2"));     // Izvadīs false

        System.out.println(moreUpperThanLower("ABCab"));       // Jāizvada true
        System.out.println(moreUpperThanLower("ABCabbbbbb"));  // Jāizvada false
        System.out.println(moreUpperThanLower("123AAAaaa"));   // Jāizvada false
    }
}
