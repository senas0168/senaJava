package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //Ternary Statement
        //Ornek 1: Sayı 10 dan kucuk ise console a "kucuk" yazdırın, degil ise "Kucuk degil" yazdırın
        //------------if else cozumu-------------------
        int num = 2;

        if (num>10){
            System.out.println("Kucuk");
        }else{
            System.out.println("Kucuk degil");
        }
        //-----------------Ternary Cozumu------------------
                           // Condition   ?  Condition true ise calısır : Condition false ise calısır ;
        String sonuc = num<10             ?           "Kucuk"            : "Kucuk degil"           ;
        System.out.println(sonuc);

        //Ornek 2: Sayi cift ise console a "cift" , tek ise "Tek" yazdırın
        int k = 13;

        if (k%2==0){
            System.out.println("cift");
        }else{
            System.out.println("tek");
        }
        //------------------Ternary cozumu-----------
        String snc = k%2==0    ?  "Çift" : "Tek" ;
        System.out.println(snc);

        //Ornek 3: Sayı 0 dan buyukse pozitif degilse ekrana pozitif degil yazdırın

        int a = 5;
        System.out.println(a>0   ? "pozitiftir" : "pozitif degil");

        //Ornek 4: Kullanıcıdan iki sayıyı alınız "buyuk olmayan" (kucuk veya esit olan) sayıyı yazdırınız
        Scanner input = new Scanner(System.in);
        System.out.println("İki sayi giriniz");

        double first = input.nextDouble();
        double second = input.nextDouble();

        //1.yol if else cozumu
        if (first<second){
            System.out.println(first);
        }else {
            System.out.println(second);
        }

        //2. yol Ternary
        double result2 = first<second ? first: second;
        System.out.println(result2);


    }
}
