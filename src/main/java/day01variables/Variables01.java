package day01variables;//icinde bulunulan package ismi

public class Variables01 {

    public static void main(String[] args) {
        //java bu satiri okumaz, Kendimize ve basklarina aciklamadır.
        /*
        java bu satırları da okumaz
         */

        //Variable nasıl  olusturulur?
//Data type + Variable name + Atama Operator (Assignment Operatoru)  + Variable Degeri + noktali virgul
        int age = 13;

//java cumlesi => statement
//Dilbilgisineki nokta ne ise javadaki ";" ayni seydir, yani statement in bittigini gosterir
//Eger variable decleration yapar, Assignment yapmazsaniz java kendi default degerlerini koyar
// Default deger sayilar icin sifirdir.
//Javada "=" assignment operator ve java bu operatoru gordugu zaman once sag tarafı calistirir.
//ve sagdaki degeri alir soldaki kutuya koyar
// Javada esittir demek "=="             Matematikte "=", Java da "=="
//Data type   +   VariableName ===> Variable declaration
//Assignment operator  (=)  + Variable degeri ==>  Assignment

        /*
         Java da temel iki tip data vardir;
            1)primitive data type:
              char, boolean, byte, short, int, long, floot, double

            2)non-primitive data type:
            Strig
         */
        //Ornek1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        String ogrenciAdi = "Ali Can";

        //Stringlre verilen degerler daima cift tirnak icinde olmalidir
        //Stringler icin default value   (==>varsayilan deger) "null" dir
           /*
           *String variable olusturdugumuzda cogu zaman ona bir deger atariz. Atama yapmazsak java o variable  icin varsayilan
           deger olarak null koyar
           *null demek 0 demek degildir, 0 da coding de bir degerdir, null ise hiclik demektir
           * null demek icinde valuable veya method bulunmayan bos bie objedir
           * {}==>eleman yok   {0}==> elemani sifir
            */

        //char data type:
        //Tek karakterler icin kullanılır. Sayi, sembol yada harf farketmez
        //Ornegin ==> A, x, 4, ?
        //Ornek 2: char data type hakkında bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        char isminIlkHarfi = 'A';
        //Note: char data type inda degerler tek tirnak icine konulmalidir

        //boolean data type:
        //boolean'lar sadece iki faarkli deger alabilir; true (dogru) veya false (yanlis)
        //isimlendirme yapilirken basina is konulur. (isEmekliMisin hoş olmuyo)
        //Ornek3: boolean data  type inda emeklimisin sorusu icin bir variablle olusturun ve false degerini atayin
        boolean isRetired = false;

        //byte data type:
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte : -128 den +127 e (dahil) tam sayi degerleri icin kullanilir
        //Ornek 4: byte data type inda ogrenci yasi icin bir variable olusturun ve deger atayin
        byte ogrenciYasi = 127;

        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        // short : -32768 den +3267 e (dahil) tam sayi degerleri icin kullanilir
        //Ornek 5: Site nufusu icin bir vaariable olusturun ve deger atayiniz
        short siteNufusu = 1300;

        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int :  -2,147,483,648 ile 2,147,483,647 e (dahil) tam sayi degerleri icin kullanilir

        //Ornek 6: Ulke nufuslari icin bir variable olusturup bir deger atamasi yapiniz
        int ulkeNufusu = 131313131;

        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long : -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir

        //Ornek 7: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz
        long cellNumberInHumanBody = 8787878787878411L;
        //Note:Bir deger long ise sonuna "L" (tavsiye edilir) yada "l" konulur.

        //Eger longa atadiginiz deger intlerin araliginda ise sonuna "L" koymaya gerek yok
        //long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder
        long weightOfSun = 123456454465L;

        //float data type:
        //virgullu sayilar (Decimal Numbers==>ondalikli sayilar) icin kullanilir.(fiyatlandirmalar => 12.99 )

        //Ornek 8: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturunuz
        float shirtPrice = 12.99f;
        float shoesPrice = 15.99f;

        //Note :Java ondalikli sayilari otomatik olarak double kabul eder
        //float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz
        //4 byte yer kaplar

        //double data type
        //double memory de 8 byte yer kaplar, ondalikli kisim icin daha fazla rakam alir
        //ondalikli sayilar icin kullanilir

        //Ornek 9: Hucre agirligi ve Amip'in agirligi icin bir variable olusturunuz

        double weightCell = 0.0000000000000000113;
        double weightAmip = 0.000000000000000015;

        //Ornek 10: Ogrenci notlari icin iki adet variable olusturunuz ve toplamlarini ekrana yazdiriniz

        //---------ekrana yazdirmak icin--------
        System.out.println(5);//ekrana yazdirmak icindir ve pointer i bir sonraki satira koyar
        System.out.println(15);//ekrana yazdirir ve pointer ı aynı satirda tutar
        // --------------------------------------

        byte note1= 55;
        byte note2 =33;
        System.out.println(note1+note2);

        //homework
        /*
        1) 3farkli data turunde variable olusturun ve bunlari farkli satirlarda yazin
        2) ulke ve sehir isimleri icin variable olusturun ve bunlari yazdirin
        3) iki tamsayi turunde variable olusturup toplamini yazdirin.

         */


    }










}