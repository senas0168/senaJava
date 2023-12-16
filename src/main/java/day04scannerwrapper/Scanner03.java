package day04scannerwrapper;


import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Kullanıcıdan iki sayı alıp 4 islem yapan ve islemlerin sonucunu ekrana yazdıran kodu yazınız

        Scanner input = new Scanner(System.in);

        System.out.println("İki sayi giriniz...");

        double sayi1 = input.nextDouble();
        double sayi2 =input.nextDouble();

        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1*sayi2);
        System.out.println(sayi1/sayi2);



    }

}
