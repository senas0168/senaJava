package day29collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {
        Queue<String> line= new PriorityQueue<>();
        line.add("Egg");
        line.add("Milk");
        line.add("Cheese");
        line.add("Meat");
        System.out.println(line);//[Cheese, Meat, Egg, Milk]

        /*
        Queue bir interface dir, bu yüzden constructor u yoktur, dolayisiyla object olustururken new keywordunden
        sonra Queue yazamayiz. Data type Queue olan bir object olussturmak icin
             1)LinkedList veya 2) PriorityQueue kullanılabilir
        Queue olustururken contuructor olarak Priority Queue kullanırsanız elemanları kendi belirleyeceginiz kurala göre sıralama
        hakkınız olur
         */

        //Deque ==> Double enden Queue (iki uclu queue)
        //Sequw daki add(), get(), peek() vb.. methodlar firslast
        //seklinde iki uclu olarak bulunur
        Deque<String> d = new LinkedList<>();
        d.add("Egg");
        d.add("Milk");
        d.add("Cheese");
        d.add("Meat");
        System.out.println(line);//[Cheese, Meat, Egg, Milk]




    }
}
