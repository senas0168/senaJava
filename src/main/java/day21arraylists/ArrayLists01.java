package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {
                /*
        1)Ayni data type indaki coklu data lari depolamak icin Array kullaniriz
        2)Arraylerin bir negatif yonu var; icine koyacagıniz eleman sayisini en basta belirlemek zorundasiniz
        3)Arrayler eleman sayisinda esnek degildirler. Bu yuzden Java "Arraylist" adli yeni bir yapi olusturdu
        Bu yapi eleman sayisinda esnekdir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar.
         1000 tane eleman koyarsaniz eleman sayisini 1000 olarak ayarlar
        4)Arraylist yerine sadece List de diyebiliriz
        5) Java Arraylistleri olusturduktan sonra Arrayleri iptal etmedi cunku;
            a)Array ler super hizlidir
            b)Array ler memory de cok az yer kaplarlar
            c)Bu nedenle eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir
        6) Arrayler pirimitive data type lari ve non-pirimitive lerin reference larini depolayabilir.
        ama Arraylistler "non-primitive" data type larini depolar. bu yuzden Arraylistler Arraylerden daha cok yer kaplar
         */

        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();

        //ArrayLiat console a nasıl yazdırılır?
        System.out.println(ages);

        //ArrayListlere eleman nasıl eklenır?
        //ArrayListlere eleman eklemek icin add() methodunu kullanırız
        //add() methodu elemanları sizin verdiginiz sirada list e ekler.(Insertion Order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1, 656);
        ages.add(3, 777);
        ages.add(888);
        System.out.println(ages);

        //Liist'e çoklu eleman nasıl eklenir ? veya List e baska bir list nasıl eklenır?
        //Bir list'e eleman eklemek icin o elemanları once bir list'in icine koymalısınız.

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);//[8, 9, 10]

        ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2, newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //ArrayList'te eleman sayısı nasıl bulunur?
        //size() method u bir listteki eleman sayısını verir
        int numOfElement = ages.size();
        System.out.println(numOfElement);//12

        //ArrayList'te spesific bir eleman nasıl alınır?
        //get() methodu index kullanarak istedigimiz elemanı almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);//656

        //ArrayList'te spesific bir eleman nasıl degistirilir?
        ages.set(6, 111);
        ages.set(4, 313);
        System.out.println(ages);

//        //Bir List teki tüm elemnları nasıl silebilirim?
//        ages.clear();
//        System.out.println(ages);//[]

        //ArrayListte specific bir elemanın var olup olmadıgını nasıl anlarız?
        boolean r = ages.contains(656);
        System.out.println(r);//true

        //Bir ArrayList'in bos olup olmadıgını nasıl kontrol edebiliriz.
        //isEmpty() methodu ArrayList bos ise true bos degilse false return eder.
        boolean r2 = ages.isEmpty();
        System.out.println(r2);//false

        //Ornek: Size verilen bir list in bos olup olmadıgını kontrol eden kodu yazınız
        ArrayList<String> names = new ArrayList<>();
        names.add("Saadet");
        names.add("Kasim");
        names.add("Ekim");
        names.add("Ali");

        //1. way
        if (names.size() == 0) {
            System.out.println("List is empty");
        } else {
            System.out.println("List has at least 1 element");
        }
        names.clear();
        //2. way Recommended
        if (names.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List has at least 1 element");
        }

        /*
        Bir method öğrenirken 3 şeyi öğrenin;
        1) o methodne iş yapar?
        2) o method nasıl kullanırlır?
        3) o method size neyi verir?

         */

    }
}
