package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    Java da method nasil olusturulur?

    1) main method un disinda classin icinde olusturulur
    2) Access Modifier + return type  +  method ismi +  () + {}

    Olusturulan method lar nasil kullanilir?
    1) Methodu olusturmak methodu calistirmak icin yeterli degildir, Kullanilmak istenen mehod
    main method un icinden kullanilir
    2)method un ismi + () yazin
    varsa islem yapacaginiz datalari parantezin icine koyun
    bu islem method call (method cagirma) olarak adlandirilir
    3)methodun ismi + parametreler ===> method signature
     */
    public static void main(String[] args) {
        int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(4,5);
        System.out.println(carpmaSonucu);

        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));

    }
    //Ornek 1:toplama islemi yapan bir method olusturunuz ve kullainiz
    public static int toplamaYap(int a, int b){//bu kisimda method kapsaminda kullanilmasini ve islenmesşni istedigimiz datalari deklare ederiz
      return  a+b;
      //return demek bu methodun cagirildigi yere bu degeri return et demek
      //main method static oldugu icin method icinde kullanacagimiz method static olmalidir
    }

    //Ornek 2: 2 sayiyi carpma islemi yapan bir method olusturun ve kullanin
    protected static long multiply(int a, int b){
     return a*b;
    }

    //Ornek 3: verilen 3 sayidan ilk ikisini carpan ve ucuncu sayi ile sonucu toplayan methodu olusturun ve kullanin
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;

    }

    /*
     1)Dikdortgenin alaninin hesaplayan methodu olusturun ve kullanin
     2)Dikdortgenin cevresini hesaplayan methodu olusturun ve kullanin
     */



}
