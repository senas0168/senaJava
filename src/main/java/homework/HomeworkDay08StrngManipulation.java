package homework;

import java.util.Scanner;

public class HomeworkDay08StrngManipulation {
    /*Homework
1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
console a yazdirin
5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
a)En az 6 character olsun
b)En az bir tane buyuk harf olsun
c)En az bir tane kucuk harf olsun
d)En az bir tane rakam olsun

Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
Note 2: Tum sorulari dinamik kodlarla cozulmelidir
Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz

*/
    public static void main(String[] args) {
        // 1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        String str = "Sena Ok 11.10.2001";
        int characNum = str.replaceAll("[0-9]", "").length();
        System.out.println("characNum = " + characNum);

        //2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
        String abc = "You can make it.";
        String result = abc.substring(1, abc.length() - 1).toUpperCase();
        System.out.println("İlk ve son character haric buyuk harf = " + result);

        //3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz

        int chFirst = abc.charAt(0);
        int chLast = abc.charAt(abc.length() - 1);
        System.out.println("chFirst Ascii= ----- " + chFirst + " \nchLast Ascii= ----- " + chLast);

        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
        //console a yazdirin

        String city = "amsterdam";
        char cityFirst = city.toUpperCase().charAt(0);
        String city1 = city.substring(1).toLowerCase();
        System.out.println(cityFirst + city1);

        //2.yol

        String result1 = city.substring(0, 1).toUpperCase() + city.toLowerCase();
        System.out.println("İlk harf buyuk digerleri kucuk = " + result1);

        /* 5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

         */
        Scanner input = new Scanner(System.in);
        System.out.println(" 5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz\n" +
                "        a)En az 6 character olsun\n" +
                "        b)En az bir tane buyuk harf olsun\n" +
                "        c)En az bir tane kucuk harf olsun\n" +
                "        d)En az bir tane rakam olsun");

        String pwd = input.nextLine();
        boolean pwdLength = pwd.length() > 5;
        System.out.println("Karakter sayisi en az 6 mi ?" + pwdLength);

        boolean pwdContainUpper = pwd.replaceAll("[A-Z]", "").length() > 0;
        System.out.println("En az bir buyuk harf iceriyor mu ?" + pwdContainUpper);

        boolean pwdContainLower = pwd.replaceAll("[a-z]","").length()>0;
        System.out.println("En az bir kuucuk harf iceriyor mu ?"+pwdContainLower);

        boolean pwdContainDigit = pwd.replaceAll("[0-9]","").length()>0;
        System.out.println("En az bir rakam iceriyor mu ?"+pwdContainDigit);

        System.out.println("********* Şifre Gecerli mi? ********* ========>   "+ (pwdLength && pwdContainLower && pwdContainUpper && pwdContainDigit));

    }
}
