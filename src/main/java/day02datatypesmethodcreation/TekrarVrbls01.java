package day02datatypesmethodcreation;

public class TekrarVrbls01 {
    public static void main(String[] args) {
        //Ornek 1: Sehir ismi icin bir variable olusturun once "Ankara" sonra da "Izmir" degerlerini atayip ekrana yazdirin

        String cityName = "Ankara";
        System.out.println(cityName);

        cityName = "İzmir";
        System.out.println(cityName);

        //Ornek 2: Sehir plaka kodu icin bir variable olusturun once 34 sonra da 35 degeri atayip console yazdirin

        byte plakaKodu = 54;
        System.out.println(plakaKodu);

        plakaKodu = 16;
        System.out.println(plakaKodu);

        //Ornek 3: Basarili mi? sorusu icin bir variable olusturun ve once "false" sonrada "true" degeriatayip ekrana yazdirin

        boolean isSuccesful = false;
        System.out.println(isSuccesful);

        isSuccesful = true;
        System.out.println(isSuccesful);
    }
}
