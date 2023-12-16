package day18multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        //Bir Array ın elemanları Array ise  bu Array ler Multidimensional Array dır

        //Multidimensional Array nasil olusturulur?

        int a [][] = new int[3][2];
        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]

        //Multidimensional Array lere eleman nasıl eklenır?
        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;
        System.out.println(Arrays.toString(a));//[[I@19dfb72a, [I@17c68925, [I@7e0ea639]
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //Multidimensional Arrayleri elemanlari console a yazdırmak icin "toString()" methodu degil
        //"deepToString()" methodu kullanmalıyız

        //Array icinden specific bir eleman nasıl yazdırılır?
        System.out.println(a[1][1]);//45
        System.out.println(a[2][0]);//123

        //Multidimensional Array icindeki array  nasıl yazdırılır?
        System.out.println(a[0]);//[I@19dfb72a
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(Arrays.toString(a[2]));//[123, 0]

        //Kisa yoldan Multidimensional Array nasıl olusturulur?
        String students [][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}} ;


        //Ornek 1: Yukarıdaki students arrayınde toplam kac tane ısım oldugunu bulunuz

        int sum = 0;
        for (String [] w : students ){
            sum = sum+w.length;
        }
        System.out.println(sum);//8





    }
}
