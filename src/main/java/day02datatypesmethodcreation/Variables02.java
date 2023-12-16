package day02datatypesmethodcreation;

public class Variables02 {
    /*
    Java'da temelde iki tip data vardir
    1)primitive data type:
    char, boolean, byte, short, int, long, float, double,

    2)non-primitive data type:
     String...
     */

    /*
    Note 1: primitive data typelarini java olusturumustur, biz olusturamayiz
    Note 2: primitive data typelarinin isimlerinde sadece kücük harf kullanilir
    Note 3: primitive datalar type larina gore memory de farkli farkli yer kaplarlar
    Note 4: primitive datalar iclerinde sadece sizin ataddiginiz degeri barindirirlar
     */

    /*
    Non_primitive Data types
    Ornegin String non primitive bir data typedir
    * Uretilen her bir class ayni zamanda bir "non-primitive" data type dir. Bu yuzden "non-primitive"
    data typelar sinirsiz sayidadir denilebir
    *Non-primitive data typelarin isimleri buyuk harf ile baslar
    *Non primitivler icin java memory de buyuklugune gore degisen boyutlarda yer ayirir
     */
    public static void main(String[] args) {
        //Ornek 1: Ulke ismi icin bir variable olusturun ve bir deger atayip console a yazdirin
        String nameOfTheCountry = "USA";
        System.out.println(nameOfTheCountry);

        /*
        Soru primitive ve non-primitive data type lari arasindaki farklar nelerdir?
        1)"primitive" ler sadece bizim atadigimiz deger icerir
        "non-primitivler" bizim ataadigimiz degeri ve methodlari icerir
        2)"primitive"ler kucuk harfle baslar, "non-primitive" ler buyu harfle baslar
        3)"primitive"leri java uretmisstir ve 8 tanedir
        "non-primitive"keri java da developerlar da uretebilir, sinirsiz sayidadir.
        4)"primitive" ler memory de data typelarina gore sabit boyutta bellek kullanabilirler
        "non-primitive"ler icin java memory de buyuklugune gore degisen boyutlarda bellek kullanabilir

         */


    }
}
