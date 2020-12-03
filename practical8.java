import java.util.*;

class Student {

    private String name;

    private int id;

    
    public Student(String name) {
        this.name = name;
        System.out.println(name);
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println(name);
        System.out.println(id);
    }
    
}

class prac10 {

    public static void main(String args[]) {
        Student s2 = new Student("Nilesh");
        Student s3 = new Student("Vikas",21);
    }
}