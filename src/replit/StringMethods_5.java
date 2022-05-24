package replit;

import java.util.Scanner;

public class StringMethods_5 {
    /*Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:
Ay Numarasi:
2
Yil :
2016
OUTPUT :
Subat 2016 29 Gundur.

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Girmek istediginiz ayin numarasini giriniz");
        int sayi = scan.nextInt();

        switch(sayi){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girdiginiz ayda 31 gun vardir");
                break;
            case 4 :
            case 6:
            case 9:
            case 11:
                System.out.println("girdiginiz ayda 30 gun vardir");
                break;
            case 2:
                System.out.println("lutfen bulundugunuz yili giriniz");
                int yıl = scan.nextInt();
                if (yıl%4==0){
                    System.out.println("Subat " + yıl +" 29 gundur");
                }else{
                    System.out.println("girdiginiz ayda 28 gun var");
                }
                break;
            default:
                System.out.println("gecerli bir ay sayisi giriniz");


        }

    }
}
