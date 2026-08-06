package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class StudentTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Write your name: ");
        student.name = sc.nextLine();

        System.out.println("Enter with first notice: ");
        student.notice1 = sc.nextDouble();
        System.out.println("Enter with second notice: ");
        student.notice2 = sc.nextDouble();
        System.out.println("Enter with third notice: ");
        student.notice3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        if(student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
