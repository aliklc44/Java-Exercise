package replit;

import java.util.Scanner;

public class StringMethods_6 {
    /*Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("3 harfli bir isim giriniz");
        String isim = scan.next();

        if(isim.charAt(0)==isim.charAt(1)){
            System.out.println("isim ayni karakterlere sahiptir.");

        }else if (isim.charAt(0)==isim.charAt(2)){
            System.out.println("isim ayni karakterlere sahiptir.");

        }else if (isim.charAt(1)==isim.charAt(2)){
            System.out.println("isim ayni karakterlere sahiptir.");
        }else System.out.println("Dizenin benzersiz karakterleri var");

    }
}
