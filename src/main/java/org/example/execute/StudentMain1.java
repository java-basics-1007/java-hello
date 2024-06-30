package org.example.execute;
import org.example.model.Student;
public class StudentMain1 {
    public static void main(String[] args) {
        // className.resourceName
        System.out.println(Student.id); // sb1, sb2
        System.out.println(Student.name);
        Student.id=100;
        Student.displayId();
    }
}
