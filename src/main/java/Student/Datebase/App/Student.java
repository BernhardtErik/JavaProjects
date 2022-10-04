package Student.Datebase.App;

import javax.swing.plaf.TableUI;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year

    public Student(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = scan.nextLine();

        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scan.nextInt();

        setID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    public Student(String firstName, String lastName, int gradeYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeYear = gradeYear;
        setID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    // Generate an ID

    private void setID(){
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses

    public void enroll(){
        // Get inside a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quite): ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else{break;}
        }while(1!=0);
        System.out.println("ENROLLED IN: " +  courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    // View balance

    public void viewBalance(){
        System.out.println("Your Balance is: " + tuitionBalance);
    }

    // pay tuition

    public void payTuition(int payment){
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: " + payment);
        viewBalance();
    }



    // Show status
}
