package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic = new Civic();
        myCivic.cool();//Civic cools perfectly
        myCivic.run();//Engine runs super
        myCivic.eco();//Uses gas less

        Engine.stop();//Stops securely

        Accord myAccord = new Accord();
        myAccord.cool();//Accords cools perfectly
        myAccord.run();//Accords cools perfectly

        System.out.println("AC price = " +Ac.price);
        System.out.println( "Engine price = " + Engine.price);
        System.out.println("Security price = " +  Security.price);
    }
}
