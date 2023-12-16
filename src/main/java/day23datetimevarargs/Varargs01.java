package day23datetimevarargs;

public class Varargs01 {
    public static void main(String[] args) {
        //toplama islemi yapan bir method olusturun

        System.out.println(add(2, 3, 4,5,6));//20

    }

    //Note 1) Bir method parantezinde birden fazla Varargs kullanılamaz
    //Note 2) Eger bir method parantezinde birden fazla parametre kullanılacaksa Varargs sonda olmalıdır


    public static int add(int... a) {
        int sum = 0;
        for ( int  w:a) {
            sum=sum+w;
        }
        return sum;
    }


    //Asagıdaki gibi farklı methodlar olusturarak is yapamayız
    //Cunku kullanıcı farklı sayıdakı sayıları toplamak isteyebilir
    //Her ihtimal icin bir method olusturmak mumkun degildir
    //java farklı sayıdaki parametrelerin hepsini kabul eden bir yapı olusturdu.
    //Bu yapuya Varargs denir
    //Varargs arkada Array yapısını kullanır

// //toplama islemi yapan bir method olusturun
//    public static int add(int a, int b){
//        return a+b;
//    }
//    public static int add(int a, int b,int c){
//        return a+b+c;
//    }
//    public static int add(int a, int b,int c, int d){
//        return a+b+c+d;
//    }

}
