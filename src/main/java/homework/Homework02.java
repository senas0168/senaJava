package homework;

public class Homework02 {
     /*
     1)Dikdortgenin alaninin hesaplayan methodu olusturun ve kullanin
     2)Dikdortgenin cevresini hesaplayan ethodu olusturun ve kullanin
     */

    public static void main(String[] args) {

     int result1 = rectangleArea(20,5);
        System.out.println(result1);
        int result2 = rectanglePerimeter(20,5);
        System.out.println(result2);
    }

    //1)
    public static int rectangleArea(int a, int b){
        return a * b;
    }
    //2)
    private static int rectanglePerimeter(int c, int d){
        return (c+d)*2;
    }
}
