package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //Note : Java "pass by value" sayesinde variable lerin orijinal degerlerini korur
        int shirtPrice = 100;
        //java methoda gonderirken orijinal degeri degil, kopyasını gonderir ve degisen sey kopya deger olur
        System.out.println(discount("student", shirtPrice));//90
        System.out.println(discount("veteran", shirtPrice));//80
        System.out.println(discount("senior", shirtPrice));//95

        //normalde indirim yaptık discount methodu ile ama buradaki deger hala orijinal
        System.out.println(shirtPrice);//100

        shirtPrice = discount("veteran", shirtPrice);
        System.out.println("shirtPrice kampanya  " + shirtPrice);

    }

    //Discount Methodunu olusturalım
    public static int discount(String type, int price) {
        switch (type) {
            case "student":
                price = price - 10;
                break;
            case "veteran":
                price = price - 20;
                break;
            case "senior":
                price = price - 5;
                break;
            default:
                price = price;
        }
        return price;
    }
    /*
    Pass By Value
    1) Java "pass by value" kullanır
    2)Yani; java methodların orijinal degeri degistirmesine musaade etmez
    3) Java method lara deger yollarken orijinal degerin kopyasını olusturur. Ve o kopyayı method a yollar
       Method kopya deger uzerinde degişiklik yapar, boylece orijinal deger korunmus olur
    4) java esnek bir dildir, istersek yazdıgımız kod ile orijinal degerin degismesini saglayabiliriz
        Bakiniz line 15

     Pass By Reference:

     1) Pass by Reference da method reference a yollanır
     2) Reference adres demektir. Adres yollanınca method adresi kullanarak orijinal degere ulasır ve prijinal degeri degistirir.
       Bu yüzden "C#" gibi Pass by Reference kullanan dillerde method variable in orijinal degerini degiştirir



     */
}
