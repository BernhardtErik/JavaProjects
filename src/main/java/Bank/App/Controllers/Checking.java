package Bank.App.Controllers;

public class Checking extends Account{
    // List properties specific to check account

    int debitCardNumber;
    int pinNumber;

    // Constructor to initialize settings for the check properties\


    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNumber = "2" + accNumber;
        System.out.println("Your account Number is: " + this.accNumber);
        System.out.println("New check account");
    }


    // List any methods specific to check accounts
}
