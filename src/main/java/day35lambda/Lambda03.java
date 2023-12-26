package day35lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {
        int sum = getSumFromSevenToSeventy();
        System.out.println(sum);//2464

        int multiplication = getMultiplicattionFromThreeToNine();
        System.out.println(multiplication);//181440

        System.out.println(getMultiplicattionFromThreeToNine2());//181440

        System.out.println(getFactorial(-4));//24

        System.out.println(getSumOfEvensBetweenTwoInt(3, 7));
    }

    //9 ) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy() {
        return IntStream.
                rangeClosed(7, 70).
                reduce(Math::addExact).
                getAsInt();
    }
    //10 ) 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.

    public static int getMultiplicattionFromThreeToNine() {
        return IntStream.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //2.yol
    public static int getMultiplicattionFromThreeToNine2() {
        return IntStream.
                range(3, 10).
                reduce(Math::multiplyExact).
                getAsInt();
    }
    //11) Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.

    public static int getFactorial(int x) {
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("Faktoriyel işlemi negatif sayilarla yapilamaz");
            return -1;
        } else {
            return IntStream.
                    rangeClosed(1, x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }

    }
    //12) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.

    public static int getSumOfEvensBetweenTwoInt(int x, int y) {
        if (x>y){
            int temp = x;
            x=y;
            y=temp;
        }
        return IntStream.
                range(x + 1, y).
                filter(t -> t % 2 == 0).
                sum();
    }
    //2.yol
    public static int getSumOfEvensBetweenTwoInt2(int x, int y) {
        if (x>y){
            int temp = x;
            x=y;
            y=temp;
        }
        return IntStream.
                range(x + 1, y).
                filter(Utils::isNumberEven).
                sum();
    }
}
