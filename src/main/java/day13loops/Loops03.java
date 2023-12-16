package day13loops;

public class Loops03 {
    public static void main(String[] args) {
        //Ornek 1: Verilen bir string de kucuk harfleri console a yazmayınız
        //"Pwd12?Ab"  ==> P12?A

        String s = "Pwd12?Ab";
        for (int i= 0; i<s.length();i++){

            char ch = s.charAt(i);
            if (ch>='a' && ch<'z'){//kucuk harfleri sectim
            continue;
            }
                System.out.print(ch);
            }

        //"break" ile "continue" arasındaki fark nedir?
        //"break" switch in dısına cıkmak ıcın ve loop u kırmak ıcın kullanılır
        //"continue" ise loop yaparken bazı elemanları ısleme sokmamak ıcın kullanılır
        //continue keywordu bir looptaki gecerli iteration ı sonlandırıp sızı artırma/azaltma bolumune goturur
        }
    }


