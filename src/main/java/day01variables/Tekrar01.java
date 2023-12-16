package day01variables;

public class Tekrar01 {
    public static void main(String[] args) {

          /*
          char, boolean, byte, short, int, long(L) yoksa int kabul eder, float(F) yoksa double kabul eder, double ----> primitive

           String -----> non primitive

           */

        //Ornek 2: char data type hakkında bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz

        char firstLetterOfTheName = 'S';

        //Ornek3: boolean data  type inda emeklimisin sorusu icin bir variablle olusturun ve false degerini atayin

        boolean isRetired = true;

        //Ornek 4: byte data type inda ogrenci yasi icin bir variable olusturun ve deger atayin

        byte ogrenciYasi = 12;

        //Ornek 5: Site nufusu icin bir vaariable olusturun ve deger atayiniz

        short populationOfTheApartment = 1500;

        //Ornek 6: Ulke nufuslari icin bir variable olusturup bir deger atamasi yapiniz

        int populationOfTheWorld =652156258;

        //Ornek 7: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz

        long cellAmuntOfHumanBody = 12558962632556L;

        //Ornek 8: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturunuz

        float ayakkabiFiyati = 45.99F;
        float gomlekFiyati = 28.78F;

        //Ornek 9: Hucre agirligi ve Amip'in agirligi icin bir variable olusturunuz

        double amipAgirligi = 0.000005468;
        double hucreAgirligi = 0.000064688;

        //Ornek 10: Ogrenci notlari icin iki adet variable olusturunuz ve toplamlarini ekrana yazdiriniz

        byte note1 = 98;
        byte note2 = 75;
        System.out.println(note1+note2);

    }
}
