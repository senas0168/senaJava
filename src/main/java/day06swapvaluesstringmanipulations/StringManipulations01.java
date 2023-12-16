package day06swapvaluesstringmanipulations;

import java.util.SplittableRandom;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type tır aynı zamanda bir class tır
        String s = "Java is easy";

        //Ornek: "s" Stringindeki tüm character leri büyük harf yapiniz
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY

        //Ornek 2: "s" Stringindeki tum character leri kucuk harf yapınız
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Ornek 3: "s" Stringindeki ilk character i alınız.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);

        //Ornek4 : "s" stringindeki bastan ikinci ve sondan ikinci characteri alınız ve ekrana yazdiriniz
        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);
        System.out.println(""+secondChar + secondLastChar);

        //Ornek 5: "s" stringinde kullanılan character sayısını bulunuz
        int sLength = s.length();
        System.out.println(sLength);

        //Ornek 6: "s" Stringindeki ilk 4 characteri alınız
        //s.substring(0,4) ==> bu kullanımda ilk index dahildir, ikinci index hariçtir

         String sub1 = s.substring(0,4);//Java
        System.out.println(sub1);

        //Ornek 7: "s" Stringindeki "is" kelimesini aliniz

       String sub2 = s.substring(5,7);
        System.out.println(sub2);//is

        //Ornek 8: "s" Stringindeki "easy" kelimesini aliniz
        String sub3 = s.substring(8,12);
        System.out.println(sub3);//easy

        //ikinci yol
        String sub4 = s.substring(8);
        System.out.println(sub4);//easy

        //Ornek 9: "s" Stringinde "money" kelimesinin olup olmadıgını kontrol ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist);//false

        //Ornek 10: "s" String'inin belli bir harf ya da harflerle baslayıp baslamadıgını kontrol ediniz
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        //Ornek 11: "s" String inin 5. index dahil olmak üzere bu indexten itibaren "i" karakteri ile baslayıp baslamadıgını
        //kontrol eden kodu yazınız


       boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);//true






    }
}
