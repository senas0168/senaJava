package day02datatypesmethodcreation;

public class TekrarMethCre01 {
    public static void main(String[] args) {
       int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);

       long carpmaSonucu = multiply(4,5);
        System.out.println(carpmaSonucu);


        System.out.println(firstTwoMultiplyThirdAd(2,3,4));
    }

    //Ornek 1:toplama islemi yapan bir method olusturunuz ve kullainiz
public static int toplamaYap(int a,int b){
        return a+b;

    }
    //Ornek 2: iki sayiyi carpma islemi yapan bir method olusturun ve kullanin
protected  static long multiply(int a,int b){
return  a*b;
}
    //Ornek 3: verilen üç sayidan ilk ikisini carpan ve ucuncu sayi ile sonucu toplayan methodu olusturun ve kullanin

private static int firstTwoMultiplyThirdAd(int a,int b, int c){
        return a*b+c;
}

}
