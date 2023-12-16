package day29collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //Ornek: Ogrenci e mail adreslerini natural order da siralanmıs olarak depolayınız.

        long t1 = System.nanoTime();
        //1.yol
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("e@gmail.com");
        emails.add("m@gmail.com");
        emails.add("p@gmail.com");
        emails.add("h@gmail.com");
        emails.add("y@gmail.com");
        emails.add("g@gmail.com");
        emails.add("v@gmail.com");
        emails.add("s@gmail.com");
        emails.add("b@gmail.com");

        System.out.println(emails);//[a@gmail.com, b@gmail.com, e@gmail.com, g@gmail.com, h@gmail.com, m@gmail.com, p@gmail.com, s@gmail.com, v@gmail.com, y@gmail.com, z@gmail.com]

        long t2 = System.nanoTime();
        //2. way
        HashSet<String> emailHs = new HashSet<>();
        emailHs.add("a@gmail.com");
        emailHs.add("z@gmail.com");
        emailHs.add("e@gmail.com");
        emailHs.add("m@gmail.com");
        emailHs.add("p@gmail.com");
        emailHs.add("h@gmail.com");
        emailHs.add("y@gmail.com");
        emailHs.add("g@gmail.com");
        emailHs.add("v@gmail.com");
        emailHs.add("s@gmail.com");
        emailHs.add("b@gmail.com");

        TreeSet<String> emailHsTs = new TreeSet<>(emailHs);
        System.out.println(emailHsTs);//[a@gmail.com, b@gmail.com, e@gmail.com, g@gmail.com, h@gmail.com, m@gmail.com, p@gmail.com, s@gmail.com, v@gmail.com, y@gmail.com, z@gmail.com]

        long t3 = System.nanoTime();
        System.out.println("treeset "+(t2-t1));//treeset 1167300
        System.out.println("hashset "+(t3-t2));//hashset 134700



    }


}
