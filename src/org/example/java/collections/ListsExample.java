package org.example.java.collections;

import java.util.*;

public class ListsExample {

    public static void main(String[] args) {
        // Create a ArrayList
        List<String> stringList = new ArrayList<>();

        // Add elements
        stringList.add("Hello");
        stringList.add("this");
        stringList.add("is");
        stringList.add("Java Class");
        System.out.println("stringList : " + stringList);

        // Add a duplicate
        stringList.add("is");
        System.out.println("stringList : " + stringList);

        // Delete Elements
        stringList.remove("Java Class");
        System.out.println("stringList : " + stringList);
        stringList.remove(0);
        System.out.println("stringList : " + stringList);

        for(int i = 0; i < stringList.size(); i++)
            System.out.println("element [" + i + "] = " + stringList.get(i));

        // Use for-each loop
        for(String s : stringList)
            System.out.println(s);

        // Use iterators
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        // Search for element
        System.out.println("Contains this " + stringList.contains("this"));

    }
}
