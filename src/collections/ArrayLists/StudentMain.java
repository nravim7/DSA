package collections.ArrayLists;

import java.util.*;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

public class StudentMain {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Marlie", 3.9));
        students.add(new Student("Alice", 3.5));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);

        students.sort(comparator);



       for (Student student: students) {
           System.out.println(student.getName() + ": " + student.getGpa());
       }

    }
}


/*
students.sort((o1, o2) -> {
        if (o2.getGpa() - o1.getGpa() > 0) {
        return 1;
        } else if(o2.getGpa() - o1.getGpa() < 0) {
        return -1;
        } else {
        return 0;
        }
        });*/
