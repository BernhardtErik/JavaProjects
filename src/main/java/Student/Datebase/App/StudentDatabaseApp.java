package Student.Datebase.App;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // Ask how many users we want to add
        System.out.println("Enter number of new student to enroll: ");
        Scanner scan = new Scanner(System.in);
        int numberOfStudents = scan.nextInt();
        Student[] students = new Student[numberOfStudents];

        // Create n number of new students

        for (int i = 0; i < students.length; i++) {
            students[i]  = new Student();
            students[i] .enroll();
            students[i] .payTuition(400);
        }

        System.out.println(students[1]);

    }
}
