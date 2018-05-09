package com.dyangalih.jfone.tools;

public class Print {
    private static Print instance;

    public static Print getInstance() {
        if(instance==null){
            instance = new Print();
        }
        return instance;
    }

    public void printOut(){
        System.out.println("======================================================");
    }
}
