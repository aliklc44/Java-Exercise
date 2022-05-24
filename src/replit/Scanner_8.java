package replit;

import java.util.Scanner;

public class Scanner_8 {
    /*Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

Örnek Çıktı:

Verilen tamsayının rakamları toplamı 10'dur.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int basamakToplamı=0;
        while (sayi!=0){
            basamakToplamı+= sayi%10;
            sayi=sayi/=10;


        }
        System.out.print("basmaklar toplami : " + basamakToplamı);


    }
}
