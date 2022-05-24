package replit;

public class StringMethods_2 {
    /*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :
John White
1234234534561478
Output : Name :
J*** W****
CN : **** **** **** 1478
Ilk Harfler Buyuk harf ile baslamalidir.
     */
    public static void main(String[] args) {


        String isim="John";
        String soyisim="White";
        String kkNo="1234234534561478";
        String yeniIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S", "*");
        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S", "*");
        String yeniKkNo="**** **** **** "+kkNo.substring(12);
        System.out.println("Name : "+yeniIsim+" "+yeniSoyisim+"\n CCN : "+yeniKkNo);
    }
}
