package com.company;

public class Main {

    public static void main(String[] args) {
        Country [] arrCountry = new Country[6];
        arrCountry[0] = new Country("Германия",1900,"Европа",10000);
        arrCountry[1] = new Country("Китай",1400,"Азия",4000);
        arrCountry[2] = new Country("США",2000,"Америка",500);
        arrCountry[3] = new Country("Франция",1456,"Европа",100);
        arrCountry[4] = new Country("Беларусь",2018,"Европа",5000);
        arrCountry[5] = new Country("Корея",1389,"Азия",50);
        
        World.getAll(arrCountry);
        System.out.println("-----------------------------");
        World.getUpdateAll(arrCountry);
    }
}
