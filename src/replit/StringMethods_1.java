package replit;

import java.util.Scanner;

public class StringMethods_1 {
    /*Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
BMI 18,5'in altındaysa zayıfsınız
BMI 18,5 ile 25 arasında ise kilonuz idealdir
BMI 25-30 arasındaysa şişmansınız
BMI 30'dan büyük veya eşitse, obez
Input:
Output:
Agirlik : 71
Boy : 1,72
BMI : 23.99945916711736
Zayifsiniz.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        double boy = scan.nextDouble();
        double kitleIndex = kilo / ((boy) * (boy));
        System.out.println("kitle index isiz : " + kitleIndex);
        if (kitleIndex < 18.5) {
            System.out.println("zayıfsınız");
        } else if (kitleIndex > 18.5 & kitleIndex < 25) {
            System.out.println("kilonuz idealdir");
        } else if (kitleIndex > 25 & kitleIndex < 30) {
            System.out.println("şişmansınız");
        } else if (kitleIndex >= 30) {
            System.out.println("obez");

        } else System.out.println("hatalı giriş");
    }
}
