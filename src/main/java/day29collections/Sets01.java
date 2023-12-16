package day29collections;

import java.util.*;

public class Sets01 {
    public static void main(String[] args) {
        /*
        1)Setler tekrarsiz eleman (unique) depolamak icin kullanılır
        2)3 tane set class vardır
            a) HashSet Class:
            "Hash" benzersiz bir id olusturma teknigidir.Bu tekniğe "Hashing Technique" denir.
            "HashSet" elemanlaarı rastgele sıralar.
            "HashSetler" elemanları sıralamadıgından cok hızlı calısır
            "HashSetler" null i eleman olarak kabul eder

             b)LinkedHashSet Class:
                "LinkedHashSet"ler elemanları sizin verdiginiz sıraya göre (insertion order) dizdiklerinden
                "HashSet" lere gore yavastırlar
                "LinkedHashSet"ler tekrarsiz eleman depolamak icindir

             c)TreeSet Classs:
                "TreeSet" ler elemanları natural order (kucukten buyuge ya da alfabetik sıra) a göre dizerler
                En yavas set "TreeSet" tir
        3)TreeSet cook yavas oldugundan mumkun oldugunca TreeSet kullanmamamya calısırız
         */

        HashSet<String> hs = new HashSet<>();
        hs.add("Mustafa");
        hs.add("Suat");
        hs.add("Saadet");
        hs.add("Fevzi");
        hs.add("Ali");
        hs.add("Veli");
        hs.add("Can");
        hs.add(null);
        System.out.println(hs);//[null, Can, Mustafa, Suat, Veli, Saadet, Fevzi, Ali]

        hs.add("Mustafa");//Tekrarli eleman ekledigimizde hata vermez ama tekrarli elemani sadece bir kez ekler
        System.out.println(hs);//[null, Can, Mustafa, Suat, Veli, Saadet, Fevzi, Ali]
        System.out.println(hs.hashCode());

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(19);
        lhs.add(13);
        lhs.add(-35);
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);//[7, 19, 13, -35, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(7);
        ls.add(119);
        ls.add(13);
        ls.add(353);
        ls.add(313);

        lhs.retainAll(ls);
        System.out.println(lhs);//[7, 13]
        System.out.println(ls);//[7, 119, 13, 353, 313]

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('T');
        ts.add('Z');
      //  ts.add(null);//TreeSet lere null eklenemez
        System.out.println(ts);//[A, B, E, G, L, T, Z]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z
        System.out.println(ts.lower('E'));//B ==> Verilen eleman olan E den bir oncekini verir
        System.out.println(ts.lower('F'));//E
        System.out.println(ts.lower('A'));//null

        System.out.println(ts.higher('L'));//T
        System.out.println(ts.higher('N'));//T
        System.out.println(ts.headSet('G'));//[A, B, E]
        System.out.println(ts.headSet('G',true));//[A, B, E, G]
        System.out.println(ts.tailSet('L'));//[L, T, Z]
        System.out.println(ts.tailSet('L',false));//[T, Z]

        System.out.println(ts.ceiling('T'));//T
        System.out.println(ts.ceiling('O'));//T

        System.out.println(ts.floor('B'));//B
        System.out.println(ts.floor('D'));//B
        System.out.println(ts.floor('A'));//null

        System.out.println(ts.subSet('B', 'L'));//substring gibi çalişir [B, E, G]
        System.out.println(ts.subSet('B',false, 'L',true));//[E, G, L]




    }
}
