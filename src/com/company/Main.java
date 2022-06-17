package com.company;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Zakhar", "Zakharchuk", 18);
        Person p2 = new Person("Kate", "Padusenko", 17);
        Student st1 = new Student("Zakhar", "Zakharchuk", 18, "IA-14", 95);
        Student st2 = new Student("Kate", "Padusenko", 17, "IA-14", 93);

        Person[] array = new Person[2];
        array[0] = p1;
        array[1] = p2;
        Arrays.sort(array, new Person.PersonComparator());
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getMark(), o2.getMark());
            }
        });
        set.add(st1);
        set.add(st2);
        Arrays.stream(array).forEach(System.out::println);
        set.forEach(System.out::println);
    }
}
