package day04scannerwrapper;

import java.lang.instrument.ClassDefinition;
import java.util.Scanner;


public class Scanner01 {

    public static void main(String[] args) {
        //Ornek: Kullanıcıdan ilk ismini ve soy ismini alip ayni satirda ekrana yazdiriniz

        //1. adim Scanner Class tan bir obje olustur
        Scanner input = new Scanner(System.in);

        //2. adım : Kullanıcıya ne istedigimize dair messaj veriniz
        System.out.println("İlk isminzi giriniz");

        // next() methodu kullanıcıdan "tek kelimelik string" almak icin kullanılır
        //3. adım : Uygun methodu kullanarak kullanıcının verdgi datayı memory ye yerleştiriniz
        String firstNme = input.next();

        System.out.println("Soy isminizi girniz..");
        String lastname = input.next();

        System.out.println(firstNme+" "+lastname);//sena ok





    }
}
