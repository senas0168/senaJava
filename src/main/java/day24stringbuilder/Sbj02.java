package day24stringbuilder;

public class Sbj02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy
        sb1.reverse();//String in ters cevrilmesi loop lar ile de yapılır bu kısa yoldur
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);//verilen indexteki char ı siler
        System.out.println(sb1);//ysae s avaJ

        sb1.delete(4,7);//baslangıc index i dahil bitis indexine kadar (haric) olan karakterleri siler
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(2,5,"OOOOOOOOO");// sb1.replace(2,5,"OOOOOOOOO"); methodu 2 dahil 5 haric yani indeks 2,3,4 karakterlerin yerine "OOOOOOOOO" koyar
        System.out.println(sb1);//ysOOOOOOOOOvaJ

        sb1.insert(3,"XXX");
        System.out.println(sb1);//ysOXXXOOOOOOOOvaJ

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Jcva");

        //sonuc 0 ise alfabetik olarak ayni siradalar demektir
        //sonuc -1 ise sb2 sb3 ten alfabetik olarak bir önde demektir
        //sonuc 1 ise sb2 sb3 ten alfabetik olarak bir sonra demektir

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);

        //StringBuilder nasil string e cevrilir?
        String str = sb2.toString().toUpperCase();
        System.out.println(str);//JAVA

        //String nasil StringBuilder a cevrilir?
        StringBuilder newSb2 = new StringBuilder(str);
        System.out.println(newSb2);//JAVA

    }
}
