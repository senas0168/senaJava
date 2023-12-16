package homework;

public class Day03HomeworkTeacher {

    /*
    homework
    icinde isim ve yas variable ları ile teach methodu bulunan bir Teacher
    objecti olusturun ve obje uzerinde bu ozellikleri kullanin
     */

    //Variable (===>pasif ozellikler)
    public  String name = "Sena";
    public byte age = 24;
    public String lessonName = "Architect";
    public double pay = 30.560;

    //method (==>aktif ozellikler)

    public void teach(){
        System.out.println("Teknik ve perspektif cizim dersleri verir. ");
    }

    public void person(){
        System.out.println("Sakin, esnek ve caliskandir.");
    }


}
