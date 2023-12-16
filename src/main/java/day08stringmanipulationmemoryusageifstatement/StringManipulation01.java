package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String in  hiç character icermedigini (Bos string oldugunu) kontrol eden kodu yazınız

        String str = "";
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu? "+ result1);//String bos mu? true

        //2. yol
        // Java eger bir konuda method olusturmussa, o methodu kullanmak en iyisidir
        boolean result2 = str.isEmpty();
        System.out.println("is Empty ? "+result2);//is Empty ? true

        //Ornek 2: Bir String in space haric hicbir character icermedigini kontrol eden kodu yazınız
        String t = "           ";
        //1. yol
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println(result3);

        //2. yol
        boolean result4= t.replace(" ","").isEmpty();
        System.out.println(result4);

        //3. yol
        boolean result5 = t.isBlank();
        System.out.println(result5);
        //isBlank() methodu sadece space iceren String ler icin true verir, space dısında bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        ////isBlank() methodu space + hicbir sey icin true verir
        //isEmpty() methodu sadece hicbir sey icin true verir

        //Ornek 3: Bir string de a, i, e characterlerinin ilk gorunumlerinin indexleri toplamını ekrana yazdırınız
        //"Java is easy to learn" ==> 1 + 5 + 8 ==> 14
        // 0123456789....imdex

        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println(idxA+idxE+idxI);//14
        //Ornek 4: Bir string deki "Java" kelimesinin ilk olarak kacıncı index te kullanıldıgını gosteren kodu yazınız
        // "Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullanımında siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis olursunuz
        String u = "Ah Java vah Java sensiz olmuyor Java.";
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //indexOf() methodu olmayan caharacterler icin kukllanılırsa her zaman -1 return eder
        int idxjava = u.indexOf("java");
        System.out.println(idxjava);//-1

        //Ornek 5: Bir string de a, i, e characterlerinin son gorunumlerinin idexleri toplamını ekrana yazdırınız

        String v = "Java is easy to learn";

        int idxOfa = v.lastIndexOf('a');
        System.out.println(idxOfa);//18

        int idxOfe = v.lastIndexOf('e');
        System.out.println(idxOfe);//17

        int idxOfi = v.lastIndexOf('i');
        System.out.println(idxOfi);//5

        System.out.println(idxOfa+idxOfe+idxOfi);//40

        //Note: lastIndexOf() methodu olmayan caharacterler icin kukllanılırsa her zaman -1 return eder
    }
}
