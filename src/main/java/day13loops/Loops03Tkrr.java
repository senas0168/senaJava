package day13loops;

public class Loops03Tkrr {
    public static void main(String[] args) {
        //Ornek 1: Verilen bir string de kucuk harfleri console a yazmayınız
        //"Pwd12?Ab"  ==> P12?A
        String s = "Pwd12?Ab";
        for (int i= 0; i<s.length();i++){
            char ch =s.charAt(i);
            if (ch>='a' && ch <='z'){
                continue;
            }else {
                System.out.print(ch);
            }
        }
    }
}
