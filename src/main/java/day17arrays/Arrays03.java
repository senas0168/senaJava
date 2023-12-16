package day17arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Specific bir elemanin array de olup olmadıgını anlamak icin gereken kodu yazınız
        String names[] = {"K", "C", "R", "A", "S"};
        String el = "R";

        //1. way
        int counter = 0;

        for (String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }
        }

        if (counter > 0) {
            System.out.println("Array has " + el);
        } else {
            System.out.println("Array does not have " + el);
        }

        /*
        1)binarySearch() methodunu sort() kullanmadan kullnanmayınız, cunku binarySearch() mantıgı sıralı elemanlar icin gecerlidir
        2)binarySearch() methodu var olan elemanlar icin size o elemanın indeksini verir
        3)binarySearch() methodundan aldıgınız indeks 0 veya 0 dan buyukse bu o eleman arrayde var demektir
        4)binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir
        "-" isaretinin anlamı o eleman yok demek
        "sayi" ise o eleman olsaydı kacıncı eleman olurdu demek
         */

        //2. way : binarySearch() methodu hızlı çalısır
        Arrays.sort(names);
       int result = Arrays.binarySearch(names,el);

       if (result<0){
           System.out.println("Array does not have "+el);
       }else {
           System.out.println("Array has "+el);
       }

        System.out.println(Arrays.toString(names));//[A, C, K, R, S]

        int num1 = Arrays.binarySearch(names,"A");
        System.out.println(num1);//0==> var hem de indexi sifirdir

        int num2 = Arrays.binarySearch(names,"K");
        System.out.println(num2);//2==> var hem de indexi ikidir

        int num3 = Arrays.binarySearch(names,"U");
        System.out.println(num3);//-6==> "-" bu eleman yok demek
                                 // 6 ise olsaydı Altıncı eleman olurdu demek
    }
}
