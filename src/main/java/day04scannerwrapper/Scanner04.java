package day04scannerwrapper;


import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Ornek: Kullanıcıdan bir dikdortgenin iki kenar uzunlugunu alınız
        //a) Alanını hesaplayınız
        //b) Cevresini hesaplayınız
        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin kisa kenar uzunlugunu giriniz...");
        double shortSide = input.nextDouble();

        System.out.println("Dikdörtgenin uzun kenar uzunlugunu giriniz...");
        double longside = input.nextDouble();

        System.out.println("Alan = "+longside*shortSide);
        System.out.println("Çevre = "+(2*shortSide+2*longside));






    }
}
