package day09ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Ornek: Kullanıcıdan alınan bir sayının tek mı cıft mı oldugunu konsola yazdırınız
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();

        //1.yol
        if (num%2== 0) {
            System.out.println("Cift sayi...");
        }

        if (num%2!=0){
            System.out.println("Tek sayi");
        }

        //2.yol
        if (num % 2 == 0) {
            System.out.println("Cift sayi");
        } else {//aksi halde
            System.out.println("Tek sayidir");
        }
    }
}