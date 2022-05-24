package replit;

import java.util.Scanner;

public class Scanner_4 {
    /*Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

1 şeker = 1.7 gr

Örnek Çıktı:

Yılda 12.41 kg şeker kullanıyor.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("gunde ne kadar cay iciyorsunuz");
        int caySayisi=scan.nextInt();
        System.out.println("ne kadar seker kullaniyorsunuz");
        int sekerSayisi = scan.nextInt();
        double seker = 1.7;

        System.out.println("yılda " + (365*sekerSayisi*seker)/1000 + " kg seker kullanıyorsunuz");


    }
}
