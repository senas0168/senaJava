package day18multidimensionalarrays;

public class Md02 {
    public static void main(String[] args) {
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        //Ornek 1: Yukarıdaki students arrayınde icinde "m" harfı olan isiöleri consol a yazdırınız

        for (String[] w : students) {

            for (String k : w) {
                if (k.contains("m")) {
                    System.out.println(k);
                }
            }
        }

        //Ornek 1: Bir integar Multidimensional Array olusturunuz, tum elemanların carpımını hesaplayınız
        int nums[][] = {{5, 4}, {2, 3,2}, {7}};
        int result = 1;
        for (int[] w : nums) {
            for (int k : w) {
                result = result*k;
            }
        }
        System.out.println(result);//1680


    }
}
