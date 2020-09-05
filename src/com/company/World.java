package com.company;

public class World {
    
    World(){
    
    }
    
    public static void getAll(Country[] arrCountry){
        for (int i = 0; i < arrCountry.length; i++){
            print(arrCountry[i]);
        }
    }
    
    public static void getUpdateAll(Country[] arrCountry){
        
        int count = 0;
        for (int i = 0; i < arrCountry.length; i++){
            if (arrCountry[i].getNamePathWorld() == "Европа"){
                count++;
            }
            
        }
        
        Country[] arrSortCountry = new Country[count];
        count = 0;
        for (int i = 0; i < arrCountry.length; i++){
            if (arrCountry[i].getNamePathWorld() == "Европа"){
                arrSortCountry[count] = new Country(arrCountry[i]);
                count++;
            }
        
        }
        System.out.println(count);
        print(arrSortCountry[0]);
        print(arrSortCountry[1]);
        print(arrSortCountry[2]);
        for (int i = 0; i < arrSortCountry.length; i++){
            for (int j = i+1; j < arrSortCountry.length; j++){
                if (arrSortCountry[i].getAreaCountry()>arrSortCountry[j].getAreaCountry()){
                    System.out.println("!!!!!!!!!!!!!!!!!" + i + " " + j);
                    swap(arrSortCountry[i], arrSortCountry[j]);
                    System.out.println("!!!!!!!!!!!!!!!!!");
                    print(arrSortCountry[0]);
                    print(arrSortCountry[1]);
                    print(arrSortCountry[2]);
                    System.out.println("!!!!!!!!!!!!!!!!!");
                }
            }
        }
        
        for (int i = 0; i < arrSortCountry.length; i++){
            print(arrSortCountry[i]);
        }
    }
    
    public static void print(Country printCounty){
        System.out.println("Страна: " + printCounty.getNameCountry()
                + " создана: " + printCounty.getCreationCountry()
                + " часть света: " + printCounty.getNamePathWorld()
                + " площадь: " + printCounty.getAreaCountry());
    }
    
    private static void swap(Country first, Country second){
        Country addCountry = new Country(first);
        first.add(second);
        second.add(addCountry);
    }
}
