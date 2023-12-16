package day31mapsexpections;

public class E04 {
    public static void main(String[] args) {
        String arr [] = {"J","A","V","A"};
        getElementFromArray(arr,3);
        getElementFromArray(arr,5);
    }
    //Array lerde olmayan bir index kullanildiginda java ArrayIndexOutOfBoundsException atar

    public static void getElementFromArray(String[] s,int idx ){
        try {
            String el = s[idx];//A
            System.out.println(el);//
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());//Index 5 out of bounds for length 4
            System.out.println(e.getCause());//null
        }
    }

}
