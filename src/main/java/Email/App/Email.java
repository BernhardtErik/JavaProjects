package Email.App;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;

    private int mailboxCapacity = 500 ;
    private int defaultpasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    // Constructor to receive the firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email for " + this.firstName + " " + this.lastName + " created.");

        // Call a method asking for the department --> return the department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = setRandomPassword(defaultpasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department+ "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    // Ask for department
    private String setDepartment(){
        System.out.print("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner scan = new Scanner(System.in);
        int departmentChoice = scan.nextInt();
        if(departmentChoice == 1){
            return "Sales";
        } else if (departmentChoice == 2) {
            return "dev";
        } else if (departmentChoice == 3) {
            return "Accounting";
        }else{
            return " ";
        }
    }

    // Creates a random password
    private String setRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password  = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    // Set the alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // Change the password

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    // Summary of all the info

    public String showInfo(){
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany email: " + email +
                "\nMailbox capacity: " + mailboxCapacity + " mb";
    }
}
