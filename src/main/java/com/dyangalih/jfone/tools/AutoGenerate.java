package com.dyangalih.jfone.tools;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class AutoGenerate {
    private static AutoGenerate instance;

    public static AutoGenerate getInstance(){
        if(instance==null){
            instance = new AutoGenerate();
        }
        return instance;
    }

    public int[] getRandomNumber(int number){
        int count[] = new int[number];
        for (int i = 0; i < count.length; i++) {
            count[i] = getRandomSingleNumber((number*2));
        }
        return count;
    }

    public int getRandomSingleNumber(int number){
        return ThreadLocalRandom.current().nextInt(0, (number) + 1);
    }

    public Double getRandomSingleDouble(){
        return ThreadLocalRandom.current().nextDouble();
    }

    public String[] getRandomString(int number){
        String character = "abcddefghijklmnopqrstuvwxyzABCDEFGHAIJKLMNOPQRSTUVWXYZ";
        String[] charArray = character.split("");
        String[] newCharArray = new String[number];
        for (int i = 0; i < number; i++) {
            newCharArray[i] = charArray[getRandomSingleNumber(charArray.length-1)];
        }

        return newCharArray;
    }
}
