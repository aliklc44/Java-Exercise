package replit;

import java.util.Scanner;

public class Scanner_7 {
    /*Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir double sayı giriniz");
        double sayi1 = scan.nextDouble();

        int sayi2 = (int)sayi1;
        System.out.println(sayi2);



    }
}
