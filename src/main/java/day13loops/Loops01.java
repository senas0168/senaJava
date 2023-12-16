package day13loops;

public class Loops01 {
    public static void main(String[] args) {

        //Ornek1: Ekrana 5 kere "Hi" yazdırın

        /*
        Code standarts
        1) Tekrar (Repitation) olmamali
        2)Dynamic olmalidir
        3)Tamir (Fix) ve update kolay yapılabilmelidir
         */

        //2. yol
        //Aynı admlar tekrar yapılması gerektiginde "loop" lar kullanılır
        //Dort tane loop var, 1) for-loop 2)while-loop 3)do-while-loop 4)for-each-loop
        //1)for-loop
        //i++ => i=i+1 =>i+=1
        /*
        for (Baslangıc degeri ;Loop calısma sartı   ; Artırma/eksiltme   ){
             calısacak konular
        }*/
        for (int i=1              ;  i<=5               ;    i++              ){
            System.out.println("Hi");
        }

        //Ornek 2: 11 den 14 e kadar olan tam sayıları ekrana yazdıran kodu yazınız
        for (int i =11  ; i<15 ; i++   ){
            System.out.println(i);
        }

        //Ornek 3: 40 den 23 e kadar olan tum sayıları ekrana yazdırınız
        for ( int i= 40 ;  i>22;    i--){

            if (i%2==0){
                System.out.println(i);
            }

        }

        //Ornek 4: 18 den 56 ya kadar tum tek sayıları ekrana yazdırınız
        for (int i= 56; i>17 ; i--){
            if (i%2!=0){
                System.out.print(i+" ");
            }

        }
    }
}
