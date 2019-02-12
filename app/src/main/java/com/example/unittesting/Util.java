package com.example.unittesting;

public class Util {

    public static String someMethod(){
        return "";
    }

    public String getName(){
        return "rich";
    }

    public String getModName(String s1, boolean toMod){
        if(toMod){
            return s1 + " modded";
        }else {
            return s1;
        }
    }
}
