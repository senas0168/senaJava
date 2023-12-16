package day20statickeywordconstructors;

public class StaticBlocks01 {
    //Bir variable olustrudugunuzda, deger atamazsanız o variable i "initialize" elmediniz demektir.
    static double pi;
    static String shape;

    //Bazen main method calıstırılmadan once variable ların hazır hale getirilimesi gerekir.
    // Bu yuzden static blokar kullanılır
    //static variable lar static blocklar icinde initialize edilirse o classin icinde
    // her seyden once hazır hale getirilmiş olur
    //birden fazla static block olması durumunda yukarıda olan once calısır
    static {
        pi = 3.14;
        System.out.println("static block 1");
    }
    static {
        shape="Circle";
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");

    }
}
