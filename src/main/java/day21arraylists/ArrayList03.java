package day21arraylists;

import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Kısa yoldan bir list nasıl  olusturulur?
        //List.of()methodu degistirilemez bir list olusturmak icin kullanılır,
        //Degisiklik yapmaya yönelik methodları desteklemez
        List<Character> initials = List.of('a','k','c','d','k');//[1, 2, 3]
        System.out.println(initials);
//        initials.add('b');
//        initials.remove(initials.indexOf('k'));
//        initials.set(0,'u');
        System.out.println(initials);

        //indexOf(aranan karakter) methodu aranan karakterin ilk gorunumunun indexini verir
        int r1 = initials.indexOf('k');
        System.out.println(r1);

        //lastIndexOf(aranan karakter) methodu aranan karakterin son gorunumunun indexini verir
        int r2= initials.lastIndexOf('k');
        System.out.println(r2);


    }
}
