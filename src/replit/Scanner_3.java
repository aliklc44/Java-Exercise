package replit;

import java.util.Scanner;

public class Scanner_3 {
    /*Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24

     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("dikdortgenin kısa kenar uzunlugunu girin");
        int kısaKenar = scan.nextInt();
        System.out.println("dikdortgenin uzun kenar uzunlugunu girin");
        int uzunKenar = scan.nextInt();

        System.out.println("dikdörtgenin cevresi : " + 2*(kısaKenar+uzunKenar));
        System.out.println("dikdörtgenin alanı : " + kısaKenar*uzunKenar);

    }
}
