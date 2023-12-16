package day09ifstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        //Ornek :Verilen karakter buyuk harf ise ekrana "Buyuk harf" yazdıran
        //kucuk harf ise "Kucuk Harf" yazdıran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz..");
        char ch = input.next().charAt(0);

        //1.yol
        if (ch>= 'A' && ch<='Z'){
            System.out.println("Buyuk Harf..");
        }

        if (ch>='a' && ch<='z'){
            System.out.println("Kucuk harf");
        }

        //2. yol

        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf..");
        }else if (ch>='a' && ch<='z'){
            System.out.println("Kucuk Harf..");
        }else{
            System.out.println("Harf degil");
        }
    }
}
