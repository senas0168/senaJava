package day30maps;

import day28interfacecollections.Security;

import java.util.*;

public class HashMap01 {

    public static void main(String[] args) {


        /*
        1) Map lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2) Key kismi tekrarsiz, value kismi tekrarli olabilir
        3) Maplerdeki her bir elemana Entry denilir, tamamina ise EntrySet denir
        4) Entry ler tekrarsiz oldugu icin EntrySet denir
        5) Key ve value lar ayri ayri data typelarinda olabilirler
        6) Map ler collection degildir farkli bir yapidir
        7) HashMap ler entryleri rastgele siralar, bu yuzden en hizli map dir
         */
        //Map nasil olusturulur?

        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 1800000);
        System.out.println(countryPopulation);//{Netherland=1800000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000}

        //get() methodu "key" ile calisir ve value kısmını verir
        int turkeyPopulation = countryPopulation.get("Turkey");
        System.out.println(turkeyPopulation);//83000000

        //Butun key leri nasıl alabiliriz?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

        //Butun value ları nasıl alabiliriz?
        Collection<Integer> value = countryPopulation.values();
        System.out.println(value);//[1800000, 400000000, 83000000, 83000000, 3000000]

        //Ornek: CountryPopulation mapindeki ulkelerin nufuslarının ortalaması nedir?
        Collection<Integer> values = countryPopulation.values();

        int sum = 0;
        for (Integer w : values) {
            sum = sum + w;

        }
        System.out.println(sum/values.size());//114160000


        //Loop lar map ler lle kullanılamaz, bunun icin entrySet methodunu kullanırız
        //entrySet() map teki entryleri kalip halinde alip bize Set in icine koyarak verir
        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);

        //Ornek 2: countryPopulation Map indeki  ulkelerin isimlerinin character sayısı ile nufusların toplamını bulunuz

        int toplam =0;
        for (Map.Entry<String,Integer>  w :entries) {
            toplam = toplam + w.getKey().length() + w.getValue();

        }
        System.out.println(toplam);//570800033
    }
}
