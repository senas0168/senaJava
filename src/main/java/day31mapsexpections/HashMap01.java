package day31mapsexpections;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        //HashMap arkasında calısan mekanızma nasıl?
        HashMap<String,String> capitals = new HashMap<>();
        capitals.put("USA","Washington");
        capitals.get("USA");
        capitals.put("Italy","Roma");
        capitals.put("Turkey","Ankara");
        capitals.get("Turkey");
        capitals.put("Italy","Floransa");
        System.out.println(capitals.hashCode());

    }
}
