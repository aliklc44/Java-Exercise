package replit;

import java.util.Scanner;

public class StringMethods_3 {
    /*Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:
INPUT :
25
46
OUTPUT :
Numaralarin Toplami:
71
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        long sayi1 = scan.nextLong();
        System.out.println("2.sayiyi giriniz");
        long sayi2 = scan.nextLong();
        long toplam = sayi1+sayi2;

        if((sayi1+sayi2)>=0){
            System.out.println("iki sayinin toplami : " + (sayi1+sayi2));

        }else System.out.println("sonuç sifirdan buyuk veya sifira esit olmali ");

        for (int basamakSayisi = 0; basamakSayisi < 10; basamakSayisi++) {
            System.out.println(toplam%10);
            toplam=toplam/10;

        }
        if(toplam>10){
            System.out.println("OverFlow");

        }
    }
}
