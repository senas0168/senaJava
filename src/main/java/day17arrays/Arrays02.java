package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek : Kullanicinin çoklu data yı bir array a yerleştirebilmesi, istedigi zaman durdurabilmesi icin gereken kodu yazınız

        /*
        1) Kullanıcıdan data almak icin Scanner object alınır
        2)Coklu data yı yerlestirebilmek icin array olusturmalıyız
        3)Array olusturabilmek icin kullanıcıdan array e kac tane eleman koyacagını almalıyız
        4) loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz ogrenci sayisini giriniz");
        int numOfELements = input.nextInt();

        String stdNames[] = new String[numOfELements];

        System.out.println("Islemi durdurmak icin 'q' ya basiniz");

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println((i + 1) + " . ogrencinin ismini giriniz");
            String name = input.next();

            if (name.equalsIgnoreCase("q")){
                break;
            }else {
                stdNames[i]= name;

            }
        }
        System.out.println(Arrays.toString(stdNames));
    }
}
