package replit;

public class Syso_7 {
    /*Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)
int a= 3;
int b= 5;
Ornek Cikti:
a=5
b=3
     */

    public static void main(String[] args) {

        int a= 3;
        int b= 5;
        System.out.println("swaptan önce : \n a : " + a + "  b : " +b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("swaptan sonra : \n a : " + a + "  b : " +b);

    }
}
