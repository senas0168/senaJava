package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive : char - boolean - byte - short - int - long -float -double
        //Wrapper Class : Character - Boolean - Byte - Short - Integar - Long - Float - Double

        //Wrapper class lar non primitive dır o yüzden memory de cok yer kaplarlar
        //dolayısıyla sart degilse Wrapper Class kullanmayı tercih etmeyiz
        //n yazıp nokta koyarsanız hic method goremezsınız cunku primitive ler method icermez
        int n = 12;

        //m yazıo nokta koyarsanız bir cok method gorebilirsiniz cunku wrapper classlar method icerir
        Integer m = 12;

        byte p = 33;
        Byte r = 44;


        //Ornek1 short data type ının minimum ve maximum degerlerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);//maxShort = 32767

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);//minShort = -32768

        //Ornek 2. int data type ının minimum degeri ile byte data type ının maxımum degerinin toplamını bulunuz
        Integer minInt  = Integer.MIN_VALUE;
        Byte maxByte = Byte.MAX_VALUE;

        System.out.println(maxByte+minInt);//-2147483521


        //Ornek 3: Primitive int i wrapper Integar a ceviriniz.(Autoboxing)
        int num = 12;
        Integer wrapperNum = num;

        //Wrapper Byte ı primitive byte a ceviriniz.(Unboxing)
        Byte a = 20;
        System.out.println(a);
        int primitiveByte = a;
        System.out.println(primitiveByte);


        //Ornek 5: Primitive char ı Wrapper Character e ceviriniz(Autoboxing)
        char initial = 'm';
        Character initialWrapper = initial;


        //Ornek 6: Wrapper Boolean ı primitive booolean a ceviriniz(Unboxing)
        Boolean isGraduated = true;
        boolean primitiveBoolean = isGraduated;

        Boolean isMarried = false;
        boolean prmtvBloolean = isMarried;


    }
}
