package org.example.java.collections;

import java.util.*;

public class StudentsExample {

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(new Student(6543, "Deepika", "Pushkar"),
                new Student(1234, "Garima", "Jaipur"),
                new Student(3456, "Khushi", "Ajmer")
                );

        // Display the list
        System.out.println("studentList " + studentList);

        Collections.sort(studentList);
        System.out.println("studentList sorted by phone " + studentList);

        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student s : studentList) {
            studentMap.put(s.getPhoneNumber(), s);
        }

        System.out.println("Student Map : " + studentMap);
        System.out.println("Get student details : " + studentMap.get(1234));
        System.out.println("Get student details : " + studentMap.get(111111));

    }
}
