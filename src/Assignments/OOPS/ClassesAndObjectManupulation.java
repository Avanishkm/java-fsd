package Assignments.OOPS;

public class ClassesAndObjectManupulation {
    static class Student{
        String name;
        int rollNumber;
    }
    public static Student myFunction(String name, int rollNumber){
        Student str = new Student();
        str.name = name;
        str.rollNumber = rollNumber;
        return str;
    }
}
