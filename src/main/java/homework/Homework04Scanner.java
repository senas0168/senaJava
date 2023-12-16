package homework;

import java.util.Scanner;

public class Homework04Scanner {
    public static void main(String[] args) {

        /*
        Homework
        1) Kullanıcıdan aldıgınız 3 tane sayının ortalamasınnı bulan kodu yazınız
        ornegin => 3,5,7 icin ortalama (3+5+7)/3=5
        2) Kullanıcıdan aldıgınız 3 basamaklı bir sayının rakamları toplamını buluuz
        ornegin => 312 icin 3+1+2=6
         */

        //Answer 1
        Scanner input =  new Scanner(System.in);
        System.out.println("3 sayi giriniz.");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();

        System.out.println((firstNumber+secondNumber+thirdNumber)/3);

        //Answer 2
        System.out.println("Lütfen 3 basamakli sayi giriniz...");
        int number = input.nextInt();

        int lastDigit = number%10;
        number = number/10;

        int secondeDigit = number%10;
        number = number/10;

        int firstDigit = number%10;

        System.out.println((lastDigit+secondeDigit+firstDigit)/3);





    }

}
