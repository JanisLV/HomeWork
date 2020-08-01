package Day3Extention;

public class Exercise3 {
    // Funkcija izrēķina masīva skaitļu summu
    public static int sum(int[] numbers) {
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }

        return result;
    }

    // Uzrakstiet funkciju, atgriež masīva maksimālo elementu
//    public static int max(int[] numbers) {
//    }

    public static void main(String[] args) {
        int[] numbers = {2, 8, 5, 0};

        System.out.println(sum(numbers));   // Izvadīs 15

//        System.out.println(max(numbers));  // Jāizvada 8
    }
}
