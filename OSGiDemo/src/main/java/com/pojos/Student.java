package com.pojos;

public class Student {

    private int id;
    private String name;
    private int age;
    private double marks_obtained;

    public Student(int id, String name, int age, double marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks_obtained = marks;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks_obtained() {
        return marks_obtained;
    }

    public void setMarks_obtained(double marks_obtained) {
        this.marks_obtained = marks_obtained;
    }


    public String toString(){

        return this.id + " " + this.name + " " + this.age + " " + this.marks_obtained;
    }
}
