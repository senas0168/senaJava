package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
              /*
             Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Ulke adı giriniz");
        String countryName = input.nextLine();

        switch (countryName.toLowerCase()){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Bu ulke tanımlı degildir");
                /*
                1)Github ta bulunan projeyi kendi lokalimize almak icin;
                a) Clone lanmak istenen projenin url i kopyalanir.
                b)Intellij den file + new + project + project from version control
                bunda sonra kodları intellij üzerinden terminal açarak git pull diyerek kendi lokalimize çekkebiliriz

                2)Kendi lokalimize almıs oldugumuz projeyi Git hub ta saklamak için;
                a) Git hub da yeni bir repo olusturulacak, bunun için repositores e tıklayın. sağ ust kosede yesil new' e tıklayın
                b)Açılan sayfada bir isimlendirme yapılarak repo public mi olsun private mi olsun karar verilecek ve create e tıklanacak
                d)Intellij den gondermek istedigimiz proje acık ıken terminal kısmı acılacak
                e) git push (=>url<=) copy + paste yapılarak enter yapacaksınız
                 */
        }
    }
}
