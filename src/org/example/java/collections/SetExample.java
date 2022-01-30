package org.example.java.collections;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        // Create a ArrayList
        Set<String> stringSet = new HashSet<>();

        // Add elements
        stringSet.add("Hello");
        stringSet.add("this");
        stringSet.add("is");
        stringSet.add("Java Class");
        System.out.println("stringSet : " + stringSet);

        // Add a duplicate
        stringSet.add("is");
        System.out.println("stringSet : " + stringSet);

        // Delete Elements
        stringSet.remove("Java Class");
        System.out.println("stringSet : " + stringSet);

        // Use for-each loop
        for(String s : stringSet)
            System.out.println(s);

        // Use iterators
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        // Search for element
        System.out.println("Contains Hello " + stringSet.contains("Hello"));
    }
}
