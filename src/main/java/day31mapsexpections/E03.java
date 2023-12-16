package day31mapsexpections;

public class E03 {
    public static void main(String[] args) {
        String s = "Java";
        getCharFromString(s,2);//v

        String t = "Java";
        getCharFromString(t,4);//
    }

    //String lerde var olmayan indexler kullanıldıgında StringIndexOutOfBoundsException atar
    public static void getCharFromString(String s,int idx){

        try {
            char ch =s.charAt(idx);
            System.out.println(ch);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullanım hatası yaptınız..."+e.getMessage());//Olmayan index kullanım hatası yaptınız...String index out of range: 4
            System.out.println(e.getCause());//null
            e.printStackTrace();
            /*
            java.lang.StringIndexOutOfBoundsException: String index out of range: 4
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
	at java.base/java.lang.String.charAt(String.java:693)
	at day31mapsexpections.E03.getCharFromString(E03.java:16)
	at day31mapsexpections.E03.main(E03.java:9)
             */

            System.out.println("kod calismaya devam etti");
        }
    }



}
