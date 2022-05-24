package replit;

import java.util.Scanner;

public class StringMethods_4 {
    /*Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:

yanıt a ise,
"Talebiniz işleniyor" mesajı yazdırılır
yanıt b ise,
"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır yanıt c ise,
"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
başka herhangi bir yanıt değeri için,
"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yapmak istediginiz islemi harf olarak giriniz");
        char harf = scan.next().charAt(0);

        switch (harf) {
            case  'a':
                System.out.println("talebiniz isleniyor");
                break;
            case 'b':
                System.out.println("yine de ilgilendiğiniz için teşekkür ederiz");
                break;
            case 'c':
                System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
                break;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
        }
    }
}
