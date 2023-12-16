package day30maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Suat", 36);
        stdAges.put("Yusuf", 33);
        stdAges.put("Serkant", 26);
        stdAges.put("Emin", 19);
        stdAges.put("Alparslan", 30);
        stdAges.put("Alparslan", 33);

        //key'i tekrarli kullandıgınızda hata vermez, en son verilen entry nin degerini kabul eder
        //Bu yontem value guncellemede kullanılabilir. Buna "overwrite" denir
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=33, Serkant=26, Emin=19}

        //replace() methodu value lari keyleri kullanarak update etmeye yarar
        stdAges.replace("Alparslan", 19);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=19, Serkant=26, Emin=19}

        //replace() methodu mapin icinde Key ve Value kısmı eslesirse gunceller
        stdAges.replace("Serkant", 19, 23);
        System.out.println(stdAges);

        //putIfAbsent("Ali",30); methodu Map de Ali key olarak yoksa Ali key ini 30 valuesu ile ekler varsa eklemez
        stdAges.putIfAbsent("Ali", 30);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=19, Serkant=26, Emin=19, Ali=30}

        System.out.println(stdAges.get("Yusuf"));//33
        System.out.println(stdAges.getOrDefault("Yusuf", 0));//33

        //eger eleman map te yoksa get() methodu null verir
        //getOrDefault() methodu ise sizin belirttiginiz degeri verir
        System.out.println(stdAges.get("Fatih"));//null
        System.out.println(stdAges.getOrDefault("Fatih", 0));//0

        //containsValue(313) methodu value larin icinde 313 olup olmadıgını kontrol eder
        System.out.println(stdAges.containsValue(313));//false

        //containsKey("Yusuf") methodu value larin icinde 313 olup olmadıgını kontrol eder
        System.out.println(stdAges.containsKey("Yusuf"));//true

        //remove("Emin") methodu key kullanarak entry i silmeye yarar
        stdAges.remove("Emin");
        System.out.println(stdAges);

        //remove("Suat",36); methodu hem key hem value kısmını kontrol eder, eslesirse siler
        stdAges.remove("Suat", 36);
        System.out.println(stdAges);
    }
}
