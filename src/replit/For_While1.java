package replit;

import java.util.Scanner;

public class For_While1 {
    /*Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

char ch1= 'a' ;

	String name =“John came late"

	Expected Output:


Number of a = 2
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim = scan.nextLine();
        System.out.println("bir harf giriniz");
        char ch1 = scan.next().charAt(0);

        int adet =0;
        for (int i = 0; i < isim.length(); i++) {
            if(ch1==isim.charAt(i)){
                adet++;


            }
        }
        System.out.println( ch1 + " yazı içinde  " + adet +" tanedir");

    }
    }

