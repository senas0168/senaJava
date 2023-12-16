package day21arraylists;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        // Bir List in baska bir List ile aynı olup olmadıgını nasıl kontrol ederiz?
        //Iki listin esit olabilmesi icin aynı index te ayni elemanlar olmalıdır
        ArrayList<String > names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");


        ArrayList<String > names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

       boolean s = names1.equals(names2);
        System.out.println(s);//false

        //Ornek: Size verilen iki Integar list te tamamıyla aynı elemanların olup olmadıgını kontrol eden kodu yazınız
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);//ist de bir collections tur
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);//true


        //ArrayList te bir elemanın ilk görunumu nasıl silinir?
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Istanbul, Yozgat, Barcelona, Miami, Istanbul, Istanbul, Yozgat]

        //remove() methodu bir elemanın ilk gorunumunu siler
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);

        //ArrayList te bir eleman index kullanılarak nasıl silinir?
        System.out.println(cities.remove(2));
        System.out.println(cities);

        //remove() methodu index ile kullanılırsa size silmiş oldugu datayı return eder
        //remove() methodu eleman ile kullanılırsa size o elemanı silip silmedigini ifade edden boolean return eder


        //ArrayList olustururken sağ tarafa(Constructor) ArrayList yazmak zorundasınız
        //Ama sol tarafa ister ArrayLister ArrayList yazın isgterseniz de List yazın şkşsş de calısır
        //Detayları Collections konusunda işleyeceğiz

        //Ornek: Bir Integer List olusturun ve 12 elemanını ages Listden siliniz

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);


//        //1. way
//        Integer nonPrimitive =12;
//        ages.remove(nonPrimitive);
//        System.out.println(ages);

        //2.yol
        ages.remove((Integer) 12);
        System.out.println(ages);

//        //3. yol
//        ages.remove(Integer.valueOf(12));
//        System.out.println(ages);

//        //4.yol
//        ages.remove(ages.indexOf(12));
//        System.out.println(ages);

        //Bir ArrayList teki bir elemanın tum gorunumlerini nasıl sileriz?
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Yozgat");
        citiesToRemove.add("Istanbul");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);

    }
}
