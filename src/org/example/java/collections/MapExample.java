package org.example.java.collections;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(10, "GoodBye");
        map.put(5, "Welcome");

        System.out.println("map = " + map);
        System.out.println("Check a key " + map.containsKey(5));
        System.out.println("Check a key " + map.containsKey(34343));

        System.out.println("Get a element = " + map.get(10));


        // Iterating over map
        // Use a key
        for (Integer key :map.keySet()) {
            System.out.println("Keyset Key " + key + " value = " + map.get(key));
        }

        // Use a entryset
        ;
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println("Entryset Key " + entry.getKey() + " value = " + entry.getValue());
        }

    }
}
