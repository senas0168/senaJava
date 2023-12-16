package day05concatinationoperatorstypecasting;

public class TypeCasting {
     /*
    Numeric primitve data type larinin birbirine donusturulmesine "Type Casting " denir
    Numeric (sayisal) Data typelar  byte  -  short   -   int  -   long    -   float   -  double
     */
    //Note 1: Kucuk data typelarini buyuk data typelarina cevirmeyi java otomatik olarak yapar
    //bu isleme "AutoWidening" (otomatik genisletme) denir.

    //Note 2: Buyuk data typelarini kucuk data typelarina cevirmek riskli bir istir, java bu riskli isi otomatik olarak yapmaz
    // bu islemi kod yazanlardan bekler.
    //Bu isleme "ExplicitNarrowing" (Aciktan Daraltma) denir
    public static void main(String[] args) {
        //byte data type ını int data type ına ceviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //int data type ını short data type ına ceviriniz

        int weight = 312;
        short weightShort =(short) weight;//Expilicit Narrowing

        //int data type ını float data type ınna cevirin

        int height = 150;
        System.out.println(height);//150

        float heightFloat = height;
        System.out.println(heightFloat);//150.0

        // double data type ını short data type ına ceviriniz

        double population = 12.99;
        System.out.println(population);//12.99

        short populationShort = (short) population;
        System.out.println(populationShort);//12

        //Example
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte) num;
        System.out.println(numByte);//4

        //Not
        //Donusum yaptıgınız sayı (260) donusseceginiz data type ının sınırları dısında ıse java kullandıgınız sayı ile mod işlemi yapar ve mod işleminin
        //sonucu sizin yeni degeriniz olur




    }
}
