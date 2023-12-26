package day32exceptions;

public class E02 {
    public static void main(String[] args) {
        //Birbirine donusturulemeyecek data type larını donusturmekte ısrar edersenız java ClassCastException atar.
        Object obj =70;
        try {
            String str = (String) obj;
            System.out.println(str);
        } catch (Exception e) {
            System.err.println("Her data type ı her data type ına ceviremezsiniz");
        }


    }


}
