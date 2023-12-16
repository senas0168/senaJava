package day19passbyvaluemethodoverloading;

public class MethodOverLoading01 {
    public static void main(String[] args) {

        add(3, 5);

        String s = "Java";
        s.contains("a");

    }
//yoruma almak istedigimiz ifadeyi ctrl+/
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    /*
    1) Method Overloading yaparken method ismi(örn: add) degiştirilmez.
    2) Method Overloading yaparken parametreler değiştirilir
       a) Parametreleri degistirirken, pareametrelerin data type ları degiştirilebilir
       b) Parametreler degiştirirken , parametrelerin sayisi degşstirilebilir
       c) Parametreler degiştirirken, parametrelerin data type ları farklı ise yerleri degistirilebilir
    3) Java icin "iami"ve "parametreleri" aynı olan iki method tamamen aynıdır
    bu yüzden ismi ve parametre "Method signature" olarak adlandırılır.

    4) Method Overloading olustururken return type i degiştirmenin  hiçbir faydası yoktur
     Method Overloading olustururken acces modifierr i degiştirmenin  hiçbir faydası yoktur
     Method Overloading olustururken method u static ya da non-static yapmanın  hiçbir faydası yoktur
     Method Overloading olustururken body yi degiştirmenin  hiçbir faydası yoktur

    5)  "private" methodlar overload edilebilir. Cunku method overloadıng sadece bir class icinde olur
    private olmak ise baska classlara gidildiginde problem olusturur

    6) static methodlar overload edilebilir
    overloadıng yapmak icin (method ismi degistirmeden) medhod signature ı degistiririz,
    dolayısıyla signature degistiginde yeni bir method olusturmus oluruz, bu nedenle static  olması bir seyi degistirmez



     */

}
