package org.example;

public class Main {
    public static boolean isHidingAnOption(String input){
        int meHiddingPlace = input.indexOf("C")-input.indexOf("X");
        int animalHiddingPlace = input.indexOf("A")-input.indexOf("C");

        if (!input.contains("C")){
            return false;
        }
        if (meHiddingPlace == animalHiddingPlace){
            return false;
        }
        if (meHiddingPlace > animalHiddingPlace){
            return false;
        }
        else {
            return true;
        }
    }
}