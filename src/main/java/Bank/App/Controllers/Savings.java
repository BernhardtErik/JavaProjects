package Bank.App.Controllers;

public class Savings extends Account{
    // List properties specific to savings account

    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the savings properties

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNumber = "1" + accNumber;
        System.out.println("Your account Number is: " + this.accNumber);
        System.out.println("New savings account");
    }


    // List any methods specific to savings accounts
}
