package replit;

import java.util.Scanner;

public class Scanner_1 {
    /*Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        double sayi = scan.nextInt();

        System.out.println("Sayinin kupunu yarisi : " +(sayi*sayi*sayi)/2);


    }
}
