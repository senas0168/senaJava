package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
        //Object nasil olusturulur
        //new keywordu sifirdan yeni bir object olusturmak icin kullanilir
        //Constructor java da objecti olusturmak icin kullanilan ozel bir methodtur
        //Class ismi + Object ismi + Assignment Operator + "new" keywordu + Constructor
             Car           myCar               =              new              Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Students aliCan = new Students();

        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.grade = " + aliCan.grade);
        System.out.println("aliCan.adress = " + aliCan.adress);

        aliCan.study();
        aliCan.feed();

        //homework
        //icinde isim ve yas variable ları ile teach methodu bulunan bir Teacher objecti olusturun ve obje uzerinde bu ozellikleri kullanin

    }
}
