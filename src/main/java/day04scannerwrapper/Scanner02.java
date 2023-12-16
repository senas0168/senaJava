package day04scannerwrapper;


import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Kullanıcıdan adresini alınız ve ekrana yazdırınız.
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen adresinizi giriniz..");

        String adress = input.nextLine();

        System.out.println(adress);


        //nextLine() methodu kullanıcıdan çok kelimeli string almak icin kullanılır


    }
}
