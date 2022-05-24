package replit;

import java.util.Scanner;

public class Scanner_2 {
    /*Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

Ornek Cikti :

Alan: 9

Cevre: 12
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("karenin kenar uzunlugunu giriniz");
        int uzunluk = scan.nextInt();

        System.out.println("karenin alani : " + uzunluk*uzunluk);
        System.out.println("karenin cevresi : " + uzunluk*4);



    }
}
