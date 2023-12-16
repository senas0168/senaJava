package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 13;
        //Bu yapinin içinde sadece bir tane data depolanabilir.
        //Ama biz code yazarken bir yapının icine çoklu data depolama ihtiyacı hissederiz
        //Bir yapinin icinde coklu data depolayabilmek icin java Array yapısını olusturmustur

        //Array nasıl  olusturtulur?
        String stdNames [] = new String[5];

        //Arraylar console a nasıl yazdırılır?
        //toString methodunnu kullanmadan sadece array ismi ile yazdırırsanız java o Array in adresini yazdırır
        System.out.println(Arrays.toString(stdNames));

        /*
        Arrayler diğer collectionlardan çokk çok daha hızlıdır(superfast)
        Arrayler diğer collectionlardan daha aaz memory kullanırlar
         */

        //Array e eleman eklemme nasıl yapılır?
        stdNames[2]="Benna";
        stdNames[3]="Abdullah";
        stdNames[4]="Recep";
        stdNames[0]="Ekim";
        stdNames[1]="Sena";

        System.out.println(Arrays.toString(stdNames));//[Ekim, Sena, Benna, Abdullah, Recep]

        //Array'den spesifik bir elemanı nasıl alırız?
        System.out.println(stdNames[3]);//Abdullah
        System.out.println(stdNames[4]);//Recep
        System.out.println(stdNames[0]);//Ekim

        //Ornek 1 :Array deki her elemanın sonuna "!" işareti koyarak ekrana yazdırınız.
        //length() stringlerde  method (parantezli), arraylerde ise parantezsiz yazılır(method değil)
        //   0    1     2      3          4.    index
        //[Ekim, Sena, Benna, Abdullah, Recep]

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "!");
        }


    }
}
