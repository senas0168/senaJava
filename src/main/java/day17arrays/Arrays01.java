package day17arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Array leri kısa yoldan nasıl olusturabiliriz?
        int arr [] = {63,7,313,8,4};
        System.out.println(Arrays.toString(arr));//[63, 7, 313, 8, 4]

        //Ornek 1: Verilen array de kac tane cıft sayı kac tane tek sayı oldugunu bulan kodu yazınız

        int sayac =0;
        for (int w : arr){
            if (w%2==0){
                sayac++;
            }
        }
        System.out.println("Array de "+ sayac+" adet cift sayi "+ (arr.length-sayac)+" adet tek sayi kullanilmistir");

        //Ornek 2: Size verilen bir string array deki isimlerden 5 character den az character icerenleri console a yazdiriniz

        String stdNames [] = new String[5];
        stdNames [0]= "Ajda";
        stdNames [1]= "Ayhan";
        stdNames [2]= "Tom";
        stdNames [3]= "Cüneyt";
        stdNames [4]= "Filiz";


        for (String  w: stdNames){
            if (w.length()<5){
                System.out.println(w);
            }
        }

        //Ornek 3: Size verilen bir string arrau deki isimleri alfabetik sıraya koyduktan sonra
        //"F" ile baslayan isimler haric diger isimleri console a yazdırınız

        //Note 1 : sort() methodu sayisal data type larini kucukten buyuge siralar (ascending order)
        //Note 2: sort() methodu string data type larını alfabetik olarak sıralar (alphabetical order)
        //Note 3; ascending order + alphabetical order ==> Naturel Order
        //Note 4: sort() methodu array elemanlarını Natural order a gore sıralar

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Cüneyt, Filiz, Tom]

        for (String w: stdNames){
            if (w.startsWith("F")){
                continue;
            }
            System.out.println(w);

        }
    }
}
