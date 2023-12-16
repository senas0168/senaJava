package day20statickeywordconstructors;

public class Student {
    /*
    1) static variable veya static method'lar (class member) tum objectler icin ortak elemandır.
    2) static class memberlar uzerinde yapılan tum degisiklikler tum objectleri etkiler
    3) static class member lar Class'a, non-static class memberlar objectlere monte edilir.
    Mesela; bir class dan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur
    ama static olanlar object sayisindan bagımsız olarak bir kere olusturulurlar
    4) static class member lara ulasmak icin object olusturmaya gerek duyulmaz,
    ama non-static class memberlara ulasmak icin object olusturmak sarttır.
    5) static variable ların diger adı "Class Variable" dir.
    Non-static variable ların diger adı "Instance Variable" veya "Object Variable" dir.
     */

    public static String stdName = "Tom Hanks";

    public int age = 13;

    public static void staticMethod(){
        System.out.println("Ben static methodum");
    }

    public void nonStaticMethod(){
        System.out.println("Ben static olmayan methodum");
    }
}
