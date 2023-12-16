package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1 : String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile
        //son elemanın içerdiği karakter sayıları toplamını ekrana yazdırın

        String arr [] = new String [5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";
        System.out.println(Arrays.toString(arr));//[Math, Science, Music, English, Art]
        System.out.println(arr[0].length() + arr[arr.length-1].length());

        //Note: Stringlerde length() methodu karakter sayisini alıyor

        //Ornek 2: String bir array olusturun, icine 5 tane eleman ekleyin,
        // tum elemanların icerdigi karakter sayıları toplamını ekrana yazdırın

        String brr [] = new String [5];
        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Ankara";
        brr[3]="Oslo";
        brr[4]="Erzurum";
        System.out.println(Arrays.toString(brr));

        //1.yol for loop
        
        int totalChar =0;
        for (int i = 0; i <brr.length ; i++) {
          totalChar = totalChar+brr[i].length();

        }
        System.out.println(totalChar);

        //2. yol for each loop (enhanced(geliştirilmiş) loop)
        //baslangıc degeri, loop un çalısma sartı ve increment/decrement kısmını kendisi halleder
        //for-each-loop "Array"lerde ve "collection"larda kullanılır

        /*
         kalibini olusturalim
                for(DataType  w:  arr/collection ismi){
                    calisaacak kodlar
                }
         */
        int sum =0;

        for (String w : brr){
           sum=sum+ w.length();
        }
        System.out.println(sum);//30

        //Ornek 3: Notlar adında integer bir array olusturunuz icine 6 tane not yerlestiriniz ve not ortalamasını ekrana yazdırınız

        int notlar []= new int[6];
        notlar[0]=50;
        notlar[1]=70;
        notlar[2]=60;
        notlar[3]=40;
        notlar[4]=90;
        notlar[5]=80;

        System.out.println(Arrays.toString(notlar));//[50, 70, 60, 40, 90, 80]
        int toplam = 0;
        for (int w : notlar){
          toplam = toplam+w;
        }
        System.out.println(toplam / notlar.length);



    }
}
