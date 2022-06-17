package com.company;

public class Student extends Person {
    private String group;
    private int mark;

    public Student(String name, String surname, int age, String group, int mark) {
        super(name, surname, age);
        this.group = group;
        this.mark = mark;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                ", mark=" + mark +
                '}';
    }
}
