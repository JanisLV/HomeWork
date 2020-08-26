package Day2Extention;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {
    // Uzrakstiet programmu, kas prasa lietotājam ievadī kalendāra mēneša numueru (no 1 līdz 12)
    // un izvada uz ekrāna mēneša nosaukumu (Janvāris, Februāris, ...)
    // Ja lietotajs ievada nepareizo mēneša numuru (<1 vai > 12)
    // programmai jāizvada atbilstošais paziņojums latviešu vālodā
    // Padoms:
    // Nodefinējiet String masīvu ar visiem mēneša nosaukumiem
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arrayMonths = {"January","February","March","April","May", "June", "July",
                "August","September","October","November","December"};
        System.out.println("Enter your number from 1 to 12 please!");
        int number = scanner.nextInt();
        if ( number<= 12 && number>=1){
            System.out.println( arrayMonths[number-1]);
        } else {
            System.out.println("You are enter wrong number!");
        }


    }
}
