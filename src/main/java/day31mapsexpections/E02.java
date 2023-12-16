package day31mapsexpections;

public class E02 {
    public static void main(String[] args) {
        String s = "1234";
        convertStringToInt(s);

        String t = "123a";
        convertStringToInt(t);
    }

    //Icınde rakamlar dişinda character olan bir string i sayiya cevirmek isteerseniz NumberFormatException aliriniz
    public static void convertStringToInt(String s) {
        try {
            Integer intS = Integer.valueOf(s);
            System.out.println(intS+1);
        }catch (NumberFormatException e){
            System.out.println("Bir String in sayiya donusturulebilmesi icin rakam disi character içermemesi gerekir");
            System.out.println(e.getMessage());
        }

    }

}
