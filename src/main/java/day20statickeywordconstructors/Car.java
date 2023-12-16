package day20statickeywordconstructors;

public class Car {
    /*
    Consturctor nedir?
    Class dan object uretmemıze yarayan code blocklardir.
    Class olusturdugumuzda java bize otomatik olarak constructor verir
    Gozle görülmeyen otomtik olarak java tarafından verilen bu constructorlara "default constructor" denir
    "default constructuor"   "  Car (){}" seklindedir

    Bir class da farklı paramaetreler kullanarak istediginiz kadar constructor olusturabilirsiniz
    farkı constructurlar sayesinde bir class dan farklı farklı objectler olusturabilirsiniz

     1) Constructor nasıl olusturulur?
     Acces modifier + Class ismi + () + {}

     Interview sorusu
     2) Method ile Constructor arasındaki farklar nelerdir?
        a)Methodlarda return type olur, constructor larda olmaz
        b)Methodlar yaptıkları ise göre isimlendirilirler, constructor lar ise her zaman "Xlass ismi" ile isimlendirilirler
        c)Method lar bir aksiyon yapmak icin oolusturulurlar. Constructor lar ise object olusturmak icindir
        d) Method isimleri kucuk harfle baslar, Constructor isimleri class isimleri ile aynı oldugu icin buyuk harfle baslar

     3)Parametreli Constructorlar olusturarak aynı class dan farklı özelliklere sahip objectler olusturabiliriz




     */
    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
