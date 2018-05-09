package com.dyangalih.jfone.collection;

import com.dyangalih.jfone.tools.AutoGenerate;
import com.dyangalih.jfone.tools.Print;
import com.github.javafaker.Faker;

import java.util.*;

public class CollectionTutorial {
    private Faker faker;

    public CollectionTutorial(){
        faker = new Faker();
    }

    public void setInterface(){
        /*
         * set random array of integer
         */
        int count[] = AutoGenerate.getInstance().getRandomNumber(20);

        Set<Integer> set = new HashSet<>();
        try{
            /*
             * add all integer data in count into hashset
             */
            for (int aCount : count) {
                set.add(aCount);
            }

            Print.getInstance().printOut();
            System.out.println(set);

            /*
              shorted list of hashset with TreeSet
             */
            TreeSet sortedSet = new TreeSet<>(set);
            Print.getInstance().printOut();
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);

            /*
             * get the first data and last data
             */
            Print.getInstance().printOut();
            System.out.println("The First element of the set is: "+ sortedSet.first());
            Print.getInstance().printOut();
            System.out.println("The last element of the set is: "+ sortedSet.last());

        }catch (Exception ignored){}
    }

    public void shortedSetInterface(){
        SortedSet set = new TreeSet();
        String[] listChar = AutoGenerate.getInstance().getRandomString(5);
        Collections.addAll(set, listChar);

        Print.getInstance().printOut();
        for (Object element : set) {
            System.out.println(element.toString());
        }
    }

    public void mapInterface(int number){
        Map<String, Integer> m1 = new HashMap<>();
        for (int i = 0; i < number; i++) {
            m1.put(faker.name().firstName(),AutoGenerate.getInstance().getRandomSingleNumber(50));
        }

        Print.getInstance().printOut();
        System.out.println("Map Elements :");
        System.out.println("\t" + m1);

    }

    public void mapEntryInterface(int number){
        HashMap<String, Double> hm = new HashMap<>();

        int luckyNumber = AutoGenerate.getInstance().getRandomSingleNumber(number-1);

        String firstName, luckyName="";

        // Put random elements to the map
        for (int i = 0; i < number; i++) {
            firstName = faker.name().firstName();
            hm.put(firstName,AutoGenerate.getInstance().getRandomSingleDouble());
            if(luckyNumber==i){
                luckyName = firstName;
            }
        }

        // Get a set of the entries
        Set set = hm.entrySet();

        Print.getInstance().printOut();

        // Display elements
        for (Object aSet : set) {
            Map.Entry me = (Map.Entry) aSet;
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        double balance = hm.get(luckyName);
        hm.put(luckyName, balance + 1000);
        System.out.println(luckyName + "'s new balance: " + hm.get(luckyName));
    }

    public void shortedMapInterface(int number){
        TreeMap<String, Double> tm = new TreeMap<>();

        int luckyNumber = AutoGenerate.getInstance().getRandomSingleNumber(number-1);

        String firstName, luckyName="";

        // Put random elements to the map
        for (int i = 0; i < number; i++) {
            firstName = faker.name().firstName();
            tm.put(firstName,AutoGenerate.getInstance().getRandomSingleDouble());
            if(luckyNumber==i){
                luckyName = firstName;
            }
        }

        // Get a set of the entries
        Set set = tm.entrySet();

        Print.getInstance().printOut();

        // Display elements
        System.out.println("The data should be ordered by name");
        for (Object aSet : set) {
            Map.Entry me = (Map.Entry) aSet;
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        double balance = tm.get(luckyName);
        tm.put(luckyName, balance + 1000);
        System.out.println(luckyName + "'s new balance: " + tm.get(luckyName));
    }

    public void enumerationInterface(){
        Enumeration days;
        Vector<String> dayNames = new Vector<>();

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();

        Print.getInstance().printOut();
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
    
    public void start(){
        /*
            set interface
         */
        setInterface();

        /*
            shorted interface
         */
        shortedSetInterface();

        /*
            map interface
         */

        mapInterface(10);

        /*
            map entry interface
         */

        mapEntryInterface(5);

        /*
            shorted map interface
         */

        shortedMapInterface(5);

        /*
            enumeration interface
         */

        enumerationInterface();
    }
}
