package com.thetestingacademy.List;

import java.util.*;

public class SortLinkedlistwithCustomObject {
    //sorting
    //
    // a LinkedList of custom objects by a specific field?
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Kamalesh",85));
        list.add(new Student("Nikilesh",85));
        list.add(new Student("Mansi",85));

        list.sort(Comparator.comparingInt(s->s.marks));
        for(Student s: list){
            System.out.println(s.toString());
        }
    }
}
//student used in list
class Student{
    String name;
    int marks;
     Student(String name,int marks){
         this.name=name;
         this.marks=marks;
     }
     public String toString(){      //this method only prints  String else it prints
         return name+"("+marks+")";
     }  //getname and getmarks combined instead of 2 diff function
}
