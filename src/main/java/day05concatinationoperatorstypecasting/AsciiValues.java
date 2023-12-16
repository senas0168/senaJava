package day05concatinationoperatorstypecasting;

public class AsciiValues {
    public static void main(String[] args) {

        /*
        java da her karakterin sayisal bir degeri vardir
        bu degerler ASCII degerler olarak adlandirilir
        Bu degerlerin tamaminin bulundugu tabloya ASCII table denir
         */

        char a ='a';
        System.out.println(a);//a

        //Herhangi bir character in ASCII degerini bulmak icin o karakteri "int " ya da "byte" data typinda bir variablein icine koyunuz

        int intA ='a';
        System.out.println(intA);//97

        byte unlem = '!';
        System.out.println(unlem);//33


        char c1 ='K';
        char c2 = '?';
        System.out.println(c1+c2);//138

        //java da charları matematiksel işlemlerde kullanırsanız, java cgar ların ASCII degerlerını kullanır

    }
}
