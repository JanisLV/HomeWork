package Day3Extention;

public class Exercise1 {
    // Funkcija atgriež minimālo no diviem skaitļiem
    public static int min(int a, int b) {
        int result;

        if (a < b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    // Uzrakstiet funkciju, kas atgriež maksimālo no diviem skaitļiem
    public static int max(int a, int b) {
       int result;
       if (a>b) {
           result = a;
       } else {
           result = b;
       }
       return result;
    }

    public static void main(String[] args) {
        System.out.println(min(15, 10)); // Izvadīs 10
        System.out.println(min(4, 100)); // Izvadīs 100

        System.out.println(max(9, 15));   // Jāizvada 15
        System.out.println(max(100, 50)); // Jāizvada 100
    }
}
