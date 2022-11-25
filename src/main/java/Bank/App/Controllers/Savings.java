package Bank.App.Controllers;

public class Savings extends Account{
    // List properties specific to savings account

    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    public void setSafetyDepositBoxId() {
        this.safetyDepositBoxId = (int)(Math.random() * Math.pow(10,3));
        this.safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }

    // Constructor to initialize settings for the savings properties

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNumber = "1" + accNumber;
        setSafetyDepositBoxId();
    }

    @Override
    public void setRate(){
        System.out.println("Imeplement rate for savings");
    }
    // List any methods specific to savings accounts

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Savings account features: " +
                "\nUnique id: " + safetyDepositBoxId +
                "\n4-Digit key: " + safetyDepositBoxKey
                );
    }
}
