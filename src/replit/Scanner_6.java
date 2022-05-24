package replit;

import java.util.Scanner;

public class Scanner_6 {
    /*Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("float bir deger giriniz");
        float deger1 = scan.nextFloat();
        short deger2 = (short)deger1;
        System.out.println(deger1);



    }
}
