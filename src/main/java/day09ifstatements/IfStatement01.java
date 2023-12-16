package day09ifstatements;

public class IfStatement01 {
    public static void main(String[] args) {

        //Ornek: Sayı uc basamaklı ise ekrana "Sayi uc basamaklıdır!" yazdırın
        // 99<number<1000

        int number = -123;

        number = Math.abs(number);//abs absolute value dur mutlak deger yapar.

        if(number>99 && number<1000){
            System.out.println("Sayi uc basamaklidir!");
        }

        //Ornek 2: Bir stringdeki tekrarsız characterleri ekrana yazdırınız
        // abbccdc ==> ad
        String str = "aac";
        char ch1 = str.charAt(0);

        if(str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = str.charAt(1);

        if (str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = str.charAt(2);

        if (str.indexOf(ch3)== str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }
    }
}
