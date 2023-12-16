package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanıcıdan alacagınız 5 basamaklı bir sayının ilk iki ve son iki basamagındaki rakamların toplamını yazdıran kodu giriniz
        //rakamların toplamını yazdıran kodu giriniz

        Scanner input = new Scanner(System.in);
        System.out.println("5 basammakli bir sayi girniz");
        int number = input.nextInt();

        //bir sayının son rakamını alabilmek icin o sayısyı 10 a bolup kalanını almalıyız
        //%10 => modulus operator solunda bulunan sayının sagında bulunan sayıya bolumunden kalanı verir
        // dolayısıyla %10 her zaman bize birler basamagında bulunan sayıyı verir
        //bir tamsayıyı bir tamsayıya bölerseniz sonucu kesinlikle tamsayı yapar
        //java bu durumda yuvarlama yapmaz, ondalık kısmı iptal eder
        //dolayısıyla bir tamsayıyı 10 a bolersek birler basamagını silmiş oluruz

        //son rakamı al
        int birlerBasamagi = number%10;
        //sayı kucult
        number = number/10;

        //sondan ikinci rakamı al
        int sondanİkinci = number%10;
        //sayı kucult
        number = number/10;

        //sondan ucuncu rakamı al
        int sondanUcuncuRakam = number%10;
        //sayı kucult
        number = number/10;

        //sondan dorduncu rakamı al
        int sondanDorduncuRakam = number%10;
        //sayı kucult
        number = number/10;

        //sondan besinci rakamı al
        int sondanBesinciRakam = number%10;
        //son rakam oldugu icin kucultmeye gerek yok

        System.out.println(sondanBesinciRakam+sondanDorduncuRakam+sondanİkinci+birlerBasamagi);

        /*
        Homework
        1) Kullanıcıdan aldıgınız 3 tane sayının ortalamasınnı bulan kodu yazınız
        ornegin => 3,5,7 icin ortalama (3+5+7)/3=5
        2) Kullanıcıdan aldıgınız 3 basamaklı bir sayının rakamları toplamını buluuz
        ornegin => 312 icin 3+1+2=6
         */


    }
}
