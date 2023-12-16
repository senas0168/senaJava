package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {
        //Ornek1;
        int a = 10;
        int b = 20;

        int r1 = a < b ? a++ : ++b;

        System.out.println(r1);//10
        System.out.println(a);//11
        System.out.println(b);//20

        //Ornek 2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz

        int c = 4;

        int r2 = c < 0 ? -1 * c : c;

        System.out.println(r2);//4

        //Ornek 3: İki sayinin işareti ayni ise bu sayilari carpan işaretleri farkli ise
        //"farkli işaretli sayilari çarpamiyorum" mesajı veren kodu yaziniz
        int m = 5;
        int n =-6;

        Object r3 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "farkli işaretli sayilari çaarpamiyorum";
        //int ya da String olmadı ikisini de kapsayan Object class oldu
        System.out.println(r3);

        //Ornek 4: Size verilen sayinin 3 basamaklı olup olmadıgını kontrol eden kodu yazınız
        int p = -313;
        p = Math.abs(p);

        String r4 = p>99 && p<1000 ? "uc basamaklıdır" : "uc basamaklı degildir";
        System.out.println(r4);

    }
}
