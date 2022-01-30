package org.example.java.collections;

public class Student implements  Comparable<Student>{

    private String name;
    private Integer phoneNumber;
    private String city;

    public Student(Integer phone, String name, String city){
        this.phoneNumber = phone;
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "phoneNumber ='" + phoneNumber + '\'' +
                ", name=" + name +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //return this.phoneNumber.compareTo(o.phoneNumber);
        return this.phoneNumber.compareTo(o.phoneNumber);
    }
}
