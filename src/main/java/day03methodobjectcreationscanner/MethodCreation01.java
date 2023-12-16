package day03methodobjectcreationscanner;

public class MethodCreation01 {

    public static void main(String[] args) {
        double kup = getCube(5);
        System.out.println("kup = " + kup);

        print("Java is easy");

        //method olusturmak icin ikinci yol
        //Ornek 2 ikinci yol: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
        //main method icinde iken method ta kullanilacak olan variable ları olusturunuz
        String str ="TechproEdu";
        //method ismi ve parametreleri yazariz
        //kirmizi kismin uzerinde bekleyip create methoda tiklariz intellij otomatik olarak bir method olusturur
        //daha sona kendi istegimize göre dizayn ederiz.
        printConsole(str);

        //Ornek 3: Verilen iki tamsayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz
        int a = 5;
        int b = 3;
        carpmaYap(a,b);

        //Ornek 4: Verilen bir tamsayinin karesini hesaplayip console a yazdiran methodu olusturup kullaniniz.
         int c =5;
         karesiniAl(c);



    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    private static void printConsole(String str) {
        System.out.println(str);
    }

    private static void karesiniAl(int c) {
        System.out.println(c*c);
    }







    //Ornek1: Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz.
    static double getCube(double a) {
        return a * a * a;
    }
    //Note: Access modifier ı default yapmak isterseniz access YAZMAYİNİZ...

    //Ornek2: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void print(String str){
        System.out.println(str);
    }
    //Eger bir method yeni bir data uretmiyor ise return type ı void olur
    //methodun return type ı void ise method body icinde return keyword u yazilmaz


    /*
    Homework
    1)Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    2)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz
     */




}


