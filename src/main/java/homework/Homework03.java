package homework;

public class Homework03 {

    public static void main(String[] args) {
        double cevre = perimeterOfCircle(2.5);
        System.out.println("cevre = " + cevre);

        double alan = areaOfCircle(4);
        System.out.println("alan = " + alan);

    }


    //Homework
    //1)Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    public static double perimeterOfCircle(double r) {
        return 2 * 3.14 * r;
    }

    //2)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    public static double areaOfCircle(double r) {
        return 3.14 * r * r;
    }


}
