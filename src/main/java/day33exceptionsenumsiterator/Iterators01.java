package day33exceptionsenumsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {


         /*
        1) Iterator'lar loop larin yaptigi ayni isi yapar
        2) Iterator' larda sonsuz loop olusma ihtimali yoktur
        3) Iterator'lar ile looplar arasinda performans farki yoktur
        4) Iterator'lar bir collection dan eleman silme ve bir collection daki elemani degistirme konusunda daha basarilidir
        5) Iki tip iterator var;
            a) Iterator : Bu sadece eleman silmede kullanilir.
                          Eleman eklemek veya elemani degistirmek mumkun degildir.

            b)ListIterator: Bu eleman silebililr, ekleyebilir ve degistirebilir

            Note: iterator sadece soldan saga (ilk elemandan son elemana) calisir
                  ListIterator ise iki yonlu calisabilir.
         */


        List<String> myList = new ArrayList<>();
        myList.add("Niyazi");
        myList.add("Saadet");
        myList.add("Fevzi");
        myList.add("Suat");
        myList.add("Mustafa");
        System.out.println(myList);//[Niyazi, Saadet, Fevzi, Suat, Mustafa]

        Iterator<String> myItr = myList.iterator();

        //iterator ile specific bir eleman nasıl silinir?

        while (myItr.hasNext()){//hasNext() pointer a senden sonra eleman var mi ? diye sorar.
                                //Eleman varsa true yoksa fal+se return eder
         String el = myItr.next();       //next(); pointer ı bir sonraki elemanın önune tasır ve ustunden atladıgı elemanı return eder
           if (el.equals("Niyazi")){
               myItr.remove();     //next(); methodunun return ettigi elemanı siler
           }
        }
        System.out.println(myList);

        //ListIterator kullanımı
        List<String> yourList = new ArrayList<>();
        yourList.add("Niyazi");
        yourList.add("Saadet");
        yourList.add("Fevzi");
        System.out.println(yourList);//[Niyazi, Saadet, Fevzi]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){
            String el = yourListItr.next();
            yourListItr.set(el+"*");//set() methodu listi update islemi icin kulllanılır
        }
        System.out.println(yourList);//[Niyazi*, Saadet*, Fevzi*]


        //ListIterator previous method kullanımı
        List<String> list3 = new ArrayList<>();
        list3.add("Niyazi");
        list3.add("Saadet");
        list3.add("Fevzi");
        System.out.println(list3);//[Niyazi, Saadet, Fevzi]

        ListIterator<String> listItr = list3.listIterator();

        //Loop kullanarak pointer ı en sona almalıyız
        while (listItr.hasNext()){
            listItr.next();
        }

        while (listItr.hasPrevious()){
          String el =  listItr.previous();

            System.out.println(el+"<==");
        }

    }


}
