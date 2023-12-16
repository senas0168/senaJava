package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?

        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//10:21:25.160861500

        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);//10

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);//22

        int second = myCurrentTime.getSecond();
        System.out.println(second);//29

        int nano = myCurrentTime.getNano();
        System.out.println(nano);//887337800

        LocalTime next = myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);//10:45:15.646673200


        //Zaman formati nasil degistirilir?

        /*
        DateTime class ta kullanılan tarih saat formları
        HH : mm ==> 24 lu saat sistemi
        hh : mm ==> 12 li saat sistemiAM, PM gosterilmez
        hh : mm a ==> 12 li saat sistemiAM, PM gosterilir
         HH : mm : ss ==> 24 lu saat sistemi
         HH : MM ==> yanlıs format MM aylar icin kullanılır
         "mm" minute demektir. "MM" month demektir

         dd-MM-yyyy ==> gun ay yıl
         MMM ==> Aug
         MMMM ==> August
         yy ==> 2022 ==> 22

         */
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm");
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);//11 : 01

        //Date formati nasıl degistirilir?
        LocalDate myDate = LocalDate.of(2023, 8, 13);
        System.out.println(myDate);//2023-08-13

        //Tarihi AY/GUN/YIL sekline ceviriniz
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyDate = dtf2.format(myDate);
        System.out.println(formattedMyDate);//08/13/2023

        //Tarih GUN/Ay ismnin ilk uc harfi / yıl sekline ceviriniz 25/Aug/22
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyDate2 = dtf3.format(myDate);
        System.out.println(formattedMyDate2);//13/Ağu/23

        //Tarih GUN/Ay ismi  / yıl sekline ceviriniz 25/Aug/2023
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyDate3 = dtf4.format(myDate);
        System.out.println(formattedMyDate3);//13/Ağustos/2023

        //Baska bir zaman dilimindeki tarih ve zamani nasil alabiliriz?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-12-01

        //Amsterdam'da ayin kaçi?
        LocalDate dateInfAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInfAmsterdam);//2023-12-01

        //Tokyo da saat kaç?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//19:51:03.786800500

        //Amsterdam da saat kaç?
        LocalTime timeInAmsterdam = LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);//11:52:29.567256700



    }


}
