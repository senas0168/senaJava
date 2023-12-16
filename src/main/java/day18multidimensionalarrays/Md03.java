package day18multidimensionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {
        //Ornek: İki boyutlu bir arrayi tek boyutlu bir array a ceviriniz
        int numbers[][] = {{5, 4}, {2, 3, 2}};//==> {5,4,3,2}

        //1. step : İki boyutlu array de kac eleman oldugunu bulan kodu yazmalıyız
        int toplamElemanSayisi = 0;
        for (int[] w : numbers) {
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        System.out.println(toplamElemanSayisi);

        //2. step : Tek boyutlu array'i iki boyutlu array'in eleman sayısını kullanarak olusturmalıyız
        int newArr [] = new int [toplamElemanSayisi];


        //3. step : İki boyutlu arrray deki elemanları tek boyutlu array e transfer etmeliyiz

        int idx =0;
        for (int [] w :numbers) {//outer loopm ie multidimensional arrayin int array olan elemanlarını tek tek alırız
            for (int k:w) {//inner loop ile w sepetine koymus oldugumuz arrayin elemanlarını tek tek alırız
                newArr[idx]=k;//yeni olusturmus oldugumuz array e index kullanarak atama yaparız
                idx++;//bir eleman ekledikten sonra bir yana kaydırma yapıyoruz
            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2]

    }
}
