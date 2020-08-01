package Day3Extention;

public class Exercise6 {
    // Funkcija apgriež teksta rindiņu
    public static String reverse(String s) {
        String reversed = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            reversed = c + reversed;
        }

        return reversed;
    }

    // Uzrakstiet funkciju, kas pārbauda, vai teksta rindiņa ir palindroms
    // t. i. no abām pusēm lasās vienādi!
//    public static boolean isPalindrome(int n) {
//    }

    public static void main(String[] args) {
//        System.out.println(isPalindrome("racecar")); // Jāizvada true
//        System.out.println(isPalindrome("level"));   // Jāizvada true
//        System.out.println(isPalindrome("hello"));   // Jāizvada false
    }
}
